package com.lc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/24 14:03
 */
public class _1 {

    private static int[] twoSum(int[] nums, int target) {
        if( nums.length == 2) {
            return new int[]{0,1};
        }
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(Objects.nonNull(map.get(target- nums[i]))) {
                result[0] = map.get(target- nums[i]);
                result[1] = i;
                return result;
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,6,3,2};
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int res: result ) {
            System.out.println(res);
        }
    }

}
