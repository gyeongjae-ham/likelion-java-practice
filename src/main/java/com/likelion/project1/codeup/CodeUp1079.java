package com.likelion.project1.codeup;

import java.io.IOException;
import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            char c = sc.next().charAt(0);
            System.out.println(c);
            if (c == 'q') break;
        }
    }
}
