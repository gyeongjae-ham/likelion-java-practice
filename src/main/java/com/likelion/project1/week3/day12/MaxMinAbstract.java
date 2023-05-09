package com.likelion.project1.week3.day12;

public abstract class MaxMinAbstract {
    public abstract int calc(Integer[] arr);

    public void printResult(Integer[] arr) {
        System.out.println(calc(arr));
    }
}
