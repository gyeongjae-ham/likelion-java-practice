package com.likelion.project1.week1.day3;

public class PrintDateEx {
    void printDate() {
        System.out.printf("%04d-%02d-%02d", 2023, 4, 20);
    }

    public static void main(String[] args) {
        PrintDateEx printDateEx = new PrintDateEx();
        printDateEx.printDate();
    }
}
