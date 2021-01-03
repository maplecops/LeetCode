package com;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/27 15:53
 */
public class Test {


    public static void main(String[] args) {

        String str = "sssaa";
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            int start =i, end = i, currentLength = 1;
            while( true) {
                start --;
                end ++;
                if( start < 0 || end >=str.length()) {
                    maxLength = Math.max(maxLength, currentLength);
                    break;
                }
                if( str.charAt(start) == str.charAt(end) ) {
                    currentLength += 2;
                }else {
                    maxLength = Math.max(maxLength, currentLength);
                    break;
                }
            }
        }
        System.out.println(maxLength);

    }

}