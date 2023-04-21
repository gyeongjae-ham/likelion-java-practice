package com.likelion.project1.week1.day5;

public class CalculateDistanceTwoPoints {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;

        Point p2 = new Point();
        p2.x = 2;
        p2.y = 3;

        int ans = Point.calculateDistanceBetweenTwoPoints(p1.x, p2.x, p1.y, p2.y);
        System.out.println(ans);
    }
}
