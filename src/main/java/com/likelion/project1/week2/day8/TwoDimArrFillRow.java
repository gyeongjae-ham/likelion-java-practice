package com.likelion.project1.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void fillOne(int arrNum, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[arrNum][i] = 1;
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillOne(1, arr);
        printArr(arr);
    }
}
