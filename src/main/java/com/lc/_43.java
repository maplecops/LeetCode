package com.lc;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/25 11:10
 */
public class _43 {

    private static String multiply(String num1, String num2) {
        if(num1.length() == 0 || num2.length() ==0) {
            return null;
        }
        char[] charArr1 = num1.toCharArray();
        char[] charArr2 = num2.toCharArray();
        int[] result = new int[charArr1.length + charArr2.length];
        for (int i = charArr1.length-1; i >=0; i--) {
            for (int j = charArr2.length-1; j >=0; j--) {
                int numA = charArr1[i] - '0';
                int numB = charArr2[j] - '0';
                int sum = numA * numB + result[i+j+1];
                result[i+j] += sum / 10;
                result[i+j+1] = sum % 10;
            }
        }
        StringBuffer sb = new StringBuffer();
        int i = 0;
        try {
            while(result[i] ==0 && i< result.length) {
                i++;
            }
        }catch (Exception e) {
            return "0";
        }

        for (; i < result.length; i++) {
            sb.append(result[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "0";
        String num2 = "0";
        System.out.println(multiply(num1, num2));
    }
}
