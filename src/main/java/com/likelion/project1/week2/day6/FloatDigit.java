package com.likelion.project1.week2.day6;

public class FloatDigit {
    public static void main(String[] args) {
        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;

        System.out.printf("f5: %f\n", f5);
        System.out.printf("f6: %f\n", f6);
        System.out.printf("f7: %f\n", f7);
        System.out.printf("f8: %f\n", f8);

        float f1 = 3.141592653589793f;
        System.out.printf("%.15f", f1);
    }
}
