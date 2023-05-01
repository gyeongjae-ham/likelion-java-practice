package com.likelion.project1.programmers;

import java.util.Arrays;

public class NumbersAndQueries {
    public static int[] solution(int[] arr, int[][] queries) {
        for(int[] v : queries) {
            int tmp = arr[v[0]];
            arr[v[0]] = arr[v[1]];
            arr[v[1]] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4};
        int[][] queries = new int[][]{{0, 3}, {1, 2}, {1, 4}};

        int[] res = solution(arr, queries);
        System.out.println(Arrays.toString(res));
    }
}
