package com.lc;

/**
 * 分而治之，获取每个柱子左边的最大值，再获取每个柱子右边的最大值
 * 然后当前柱子的存水量就是min(左边最大值，右边最大值) - 柱子的高度，最小为0
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/24 15:58
 */
public class _42 {

    private static int trap(int[] height) {
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1], height[i-1]);
        }
        for (int i = height.length-2; i > 0; i--) {
            maxRight[i] = Math.max(maxRight[i+1], height[i+1]);
        }
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            int min = Math.min(maxLeft[i], maxRight[i]);
            if( min > height[i]) {
                max += (min - height[i]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{4,2,0,3,2,5};
        // output 9
        System.out.println(trap(height));
    }
}
