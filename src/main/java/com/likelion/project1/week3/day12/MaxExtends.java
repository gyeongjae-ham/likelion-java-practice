package com.likelion.project1.week3.day12;

import java.util.Arrays;
import java.util.Collections;

public class MaxExtends extends MaxMinAbstract {

    @Override
    public int calc(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[0];
    }

    public static void main(String[] args) {
        MaxExtends maxExtends = new MaxExtends();
        Integer[] arr = {1, 2, 3, 4, 5, 6, 10};
        maxExtends.printResult(arr);
    }
}
