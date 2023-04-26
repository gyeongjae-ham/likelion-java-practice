package com.likelion.project1.week2.day8;

public class ReferenceTypeArray {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "김경록";
        students[0].phoneNumber = "01012341234";
        students[0].age = 37;
        students[0] = new Student();
        students[0].name = "김지유";
        students[0].phoneNumber = "01043214521";
        students[0].age = 2;
    }
}
