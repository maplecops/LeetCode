package com.lc;

import java.util.*;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/27 21:58
 */
public class _205 {

    private static boolean isIsomorphic(String s, String t) {
        if(Objects.isNull(s) || Objects.isNull(t)) {
            return false;
        }
        if( s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> m1 = new HashMap<>();
        Map<Character, Character> m2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char mc = s.charAt(i);
            char tc = t.charAt(i);
            if( (null != m1.get(mc) && m1.get(mc) != tc) ||
                    (null != m2.get(tc) && m2.get(tc) != mc)) {
                return false;
            }
            m1.put(mc, tc);
            m2.put(tc, mc);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egw";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

}
