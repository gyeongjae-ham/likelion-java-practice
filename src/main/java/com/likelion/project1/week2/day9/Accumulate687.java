package com.likelion.project1.week2.day9;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer = answer + (num % 10);
        System.out.printf("num:%d, answer:%d\n", num, answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);
    }
}
