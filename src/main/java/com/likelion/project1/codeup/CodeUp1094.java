package com.likelion.project1.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class CodeUp1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {
            stk.push(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            if (!stk.empty()) {
                Integer res = stk.pop();
                System.out.printf("%d ", res);
            }
        }
    }
}
