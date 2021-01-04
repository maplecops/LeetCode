package com.lc;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _509 {


    private static Map<Integer, Integer> fibMap = new HashMap<>();
    private static int fib(int n) {
        if(Objects.isNull(fibMap.get(n))) {
            fibMap.put(n, fib(n-1) + fib(n-2));
        }
        return fibMap.get(n);
    }

    public static void main(String[] args) {
        fibMap.put(0, 0);
        fibMap.put(1, 1);
        int n = 10;
        System.out.println(fib(n));
    }

}
