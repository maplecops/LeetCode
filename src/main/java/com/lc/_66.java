package com.lc;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/24 18:00
 */
public class _66 {

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0 ; i--) {
            if( digits[i] != 9) {
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits = new int[] {};
        int[] result = plusOne(digits);
        for (int r: result) {
            System.out.print(r + " ");
        }
    }
}
