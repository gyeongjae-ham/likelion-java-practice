package com.likelion.project1.programmers;

import java.util.Arrays;

public class MakeTwoDimArray {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] answer = solution(6);
        System.out.println(Arrays.deepToString(answer));
    }
}
