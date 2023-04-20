package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1068 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if (a > 89) System.out.println("A");
        else if (a > 69) System.out.println("B");
        else if (a > 39) System.out.println("C");
        else System.out.println("D");
    }
}
