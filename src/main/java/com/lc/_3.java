package com.lc;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/24 17:18
 */
public class _3 {

    private static int lengthOfLongestSubstring(String s) {
        if(Objects.isNull(s) || s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int start =0,end = 0; end < s.length(); end++) {
            if( map.get(s.charAt(end)) != null) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            map.put(s.charAt(end), end+1);
            max = Math.max(end - start + 1, max);
        }

        return max;
    }

    public static void main(String[] args) {
        String s = "abbc";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
