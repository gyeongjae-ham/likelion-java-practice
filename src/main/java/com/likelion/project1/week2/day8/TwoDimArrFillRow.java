package com.likelion.project1.week2.day8;

import java.util.Arrays;

public class TwoDimArrFillRow {
    public static void fillRowOne(int rowNum, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[rowNum][i] = 1;
        }
    }

    public static void fillColOne(int colNum, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][colNum] = 1;
        }
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        fillRowOne(1, arr);
        fillColOne(2, arr);
        printArr(arr);
    }
}
