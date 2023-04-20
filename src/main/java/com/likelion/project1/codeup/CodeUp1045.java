package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long sum = a + b;
        long min = a - b;
        long mul = a * b;
        long div = a / b;
        long res = a % b;
        double ans = (double) a / (double) b;

        System.out.println(sum);
        System.out.println(min);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(res);
        System.out.format("%.2f", ans);
    }
}
