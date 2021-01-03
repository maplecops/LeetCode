package com;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/27 16:27
 */
public class Test2 {

    public static void main(String[] args) {

        ReentrantLock lock = new ReentrantLock(true);
        Condition printAC = lock.newCondition();
        Condition printBC = lock.newCondition();
        Thread printA = new Thread(new PrintThread(lock, printAC, printBC, 1));
        Thread printB = new Thread(new PrintThread(lock, printBC,printAC, 2));
        printA.start();
        printB.start();
        try {
            lock.lock();
            printAC.signal();
        }finally {
            lock.unlock();
        }

    }

}
class PrintThread implements Runnable {

    private int initValue;

    private Condition ownC;

    private Condition otherC;

    ReentrantLock lock;

    public PrintThread(ReentrantLock lock, Condition ownC, Condition otherC, int initValue) {
        this.lock = lock;
        this.ownC = ownC;
        this.otherC = otherC;
        this.initValue = initValue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                lock.lock();
                ownC.await();
                System.out.println(Thread.currentThread().getName() + "-" + (initValue + i *2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                otherC.signal();
                lock.unlock();
            }

        }
    }
}