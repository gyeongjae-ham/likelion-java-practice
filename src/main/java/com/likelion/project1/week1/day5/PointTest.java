package com.likelion.project1.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.println("x: " + p1.x + ", y: " + p1.y);
        System.out.println("xy가 같은지? " + p1.isSameXy());

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
    }
}
