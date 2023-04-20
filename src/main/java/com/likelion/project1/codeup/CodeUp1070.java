package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1070 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());

        if (m == 12 || (m > 0 && m < 3)) System.out.println("winter");
        if (m > 2 && m < 6) System.out.println("spring");
        if (m > 5 && m < 9) System.out.println("summer");
        if (m > 8 && m < 12) System.out.println("fall");
    }
}
