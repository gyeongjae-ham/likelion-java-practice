package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        if (word.equals("A")) System.out.println("best!!!");
        else if (word.equals("B")) System.out.println("good!!");
        else if (word.equals("C")) System.out.println("run!");
        else if (word.equals("D")) System.out.println("slowly~");
        else System.out.println("what?");
    }
}
