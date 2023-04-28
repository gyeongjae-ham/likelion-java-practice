package com.likelion.project1.week2.day10;

public class IfPromotion {
    public static void ifPromotionRight(int year, int proNum) {
        if (year > 5 || proNum > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
    public static void main(String[] args) {
        int year = 8;
        int proNumber = 12;

        ifPromotionRight(year, proNumber);
    }
}
