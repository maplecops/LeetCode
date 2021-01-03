package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chenzhongzhi
 * @version 1.0
 * @date 2020/12/27 14:43
 */
public class Main {
    public static int cnt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> temp = new ArrayList<>();
        boolean[] isVis = new boolean[a];
        int tar = 24;
        Arrays.sort(arr);
        backTrack(arr, isVis, 24, 0, temp);

        System.out.println(cnt);
    }

    public static void backTrack(int[] arr, boolean[] isvis, int tar, int start, ArrayList<Integer> temp) {
        if (tar == 0) {
            cnt++;
            return;
        }
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > tar)
                continue;
            if (i != 0 && arr[i] == arr[i - 1] && !isvis[i - 1])
                continue;
            temp.add(arr[i]);
            isvis[i] = true;
            backTrack(arr, isvis, tar - arr[i], i + 1, temp);
            isvis[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}