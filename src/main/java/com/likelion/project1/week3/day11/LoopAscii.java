package com.likelion.project1.week3.day11;

public class LoopAscii {
    public static void main(String[] args) {
        for (int c = 65; c < 'Z'; c++) {
            System.out.printf("%d:%c ", c, c);
        }
    }
}
