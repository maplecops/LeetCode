package com.lc;

import java.util.Arrays;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/25 15:10
 */
public class _455 {

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if( g[count] <= s[i]) {
                count ++;
                if( count == g.length) {
                    return count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 孩子的胃口大小
        int[] g = new int[] {1,2};
        // 饼干的大小
        int[] s = new int[] {1,2,3};

        System.out.println(findContentChildren(g,s));
    }
}
