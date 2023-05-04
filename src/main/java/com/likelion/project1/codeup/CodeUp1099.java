package com.likelion.project1.codeup;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1099 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        // 지도 초기화
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 개미굴 시작점
        int start = 1;
        Loop1:
        for (int i = 1; i < 9; i++) {
            Loop2:
            for (int j = start; j < 10; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 9;
                } else if (arr[i][j] == 1) {
                    if (arr[i + 1][j - 1] == 0) {
                        arr[i + 1][j - 1] = 9;
                    }
                    start = j - 1;
                    break;
                } else if (arr[i][j] == 2) {
                    arr[i][j] = 9;
                    break Loop1;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
