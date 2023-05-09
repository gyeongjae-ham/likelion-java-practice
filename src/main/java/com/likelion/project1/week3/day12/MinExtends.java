package com.likelion.project1.week3.day12;

import java.util.Arrays;

public class MinExtends extends MaxMinAbstract {
    @Override
    public int calc(Integer[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String[] args) {
        MinExtends minExtends = new MinExtends();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 10};
        minExtends.printResult(arr);
    }
}
