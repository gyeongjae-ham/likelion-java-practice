package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1031 {
    public static void main(String[] args) throws IOException {
        // 커밋
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = Integer.toOctalString(Integer.parseInt(br.readLine()));
        System.out.println(res);
    }
}
