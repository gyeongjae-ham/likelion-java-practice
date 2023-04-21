package com.likelion.project1.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        return x == y;
    }

    static int calculateDistanceBetweenTwoPoints(int x1, int x2, int y1, int y2) {
        int res = (int) Math.pow(x2 - x1, 2) + (int) Math.pow(y2 - y1, 2);
        return res;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }
}
