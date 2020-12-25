package com.lc;

/**
 * 注意点：
 *  1. 反转后的数字，是否超过int的范围
 *      int 的定义是占用4个字节，每个字节8位，所以int最多占用32位，但是由于首位用来标记正/负，所以有效的数据长度位2^31-1
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/24 11:48
 */
public class _7 {

    private static int reverse(int x) {
        double n = 0;
        while (x != 0) {
            n = n * 10 + x % 10.0;
            x = x / 10;
        }
        return (int) n ==n ? (int)n :0;
    }

    public static void main(String[] args) {
        int x = 153;
        System.out.println(reverse(x));
    }

}
