package com.likelion.project1.codeup;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 바둑판 초기화 하기
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // n 받고 좌표 값 입력받아서 그만큼 바꾸기
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                if (arr[x - 1][j] == 0) arr[x - 1][j] = 1;
                else arr[x - 1][j] = 0;
                for (int k = 0; k < 19; k++) {
                    if (arr[k][y - 1] == 0) arr[k][y - 1] = 1;
                    else arr[k][y - 1] = 0;
                }
            }
        }

        // 변경된 바둑판 출력하기
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
