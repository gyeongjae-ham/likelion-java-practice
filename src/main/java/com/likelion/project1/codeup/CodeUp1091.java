package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        for (int i = 1; i < n; i++) {
            a = a * m + d;
        }
        System.out.println(a);
    }
}
