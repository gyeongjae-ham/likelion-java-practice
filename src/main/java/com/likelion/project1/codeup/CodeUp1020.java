package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String dateInfo[] = br.readLine().split("-");

        for (int i = 0; i < dateInfo.length; i++) {
            sb.append(dateInfo[i]);
        }
        System.out.println(sb.toString());
    }
}
