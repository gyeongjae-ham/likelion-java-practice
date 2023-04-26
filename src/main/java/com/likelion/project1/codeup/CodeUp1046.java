package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1046 {
    public static void main(String[] args) throws IOException {
        // 커밋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long sum = a + b + c;
        double del = 3.0;
        double avg = (double) sum / del;

        System.out.println(sum);
        System.out.format("%.1f", avg);
    }
}
