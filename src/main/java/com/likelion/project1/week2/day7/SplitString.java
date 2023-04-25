package com.likelion.project1.week2.day7;

public class SplitString {
    public static void main(String[] args) {
        String personInfo1 = "김경록,37,oceanfog1@gmail.com";
        String personInfo2 = "김미미,28,abc@gmail.com";

        String[] infoArr1 = personInfo1.split(",");
        String[] infoArr2 = personInfo2.split(",");

        System.out.println("이름: " + infoArr1[0] + " 나이: " + infoArr1[1] + " 이메일: " + infoArr1[2]);
        System.out.println("이름: " + infoArr2[0] + " 나이: " + infoArr2[1] + " 이메일: " + infoArr2[2]);
    }
}
