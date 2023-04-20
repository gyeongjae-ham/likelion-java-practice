package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long w = Long.parseLong(st.nextToken());
        long h = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        double res = (double) (w * h * b) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB", res);
    }
}
