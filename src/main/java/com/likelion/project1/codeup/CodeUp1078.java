package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1078 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < num + 1; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
