package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String dateInfo[] = br.readLine().split("\\.");
        int y = Integer.parseInt(dateInfo[0]);
        int m = Integer.parseInt(dateInfo[1]);
        int d = Integer.parseInt(dateInfo[2]);
        System.out.format("%04d.%02d.%02d", y, m, d);
    }
}
