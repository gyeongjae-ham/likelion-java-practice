package com.likelion.project1.programmers;

public class AttatchNumbers {
    public static int solution(int[] num_list) {
        StringBuilder esb = new StringBuilder();
        StringBuilder osb = new StringBuilder();

        for(int i: num_list) {
            if(i%2==0) {
                esb.append(i);
            }
            else {
                osb.append(i);
            }
        }
        int answer = Integer.parseInt(esb.toString()) + Integer.parseInt(osb.toString());
        return answer;
    }

    public static void main(String[] args) {
        int[] num_list = new int[]{3, 4, 5, 2, 1};

        int ans = solution(num_list);
        System.out.println("ans = " + ans);
    }
}
