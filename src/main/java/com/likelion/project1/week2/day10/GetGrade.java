package com.likelion.project1.week2.day10;

public class GetGrade {
    public static void main(String[] args) {
        int score = 95;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
