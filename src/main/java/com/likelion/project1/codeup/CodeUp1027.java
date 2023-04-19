package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] info = br.readLine().split("\\.");
        int y = Integer.parseInt(info[0]);
        int m = Integer.parseInt(info[1]);
        int d = Integer.parseInt(info[2]);

        System.out.format("%02d-%02d-%04d", d, m, y);
    }
}
