package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer number = Integer.parseInt(br.readLine());
        int del = 10000;

        for (int i = 0; i < 5; i++) {
            Integer res = number / del;
            System.out.println("[" + Integer.toString(res * del) + "]");
            number -= res * del;
            del /= 10;
        }

    }
}
