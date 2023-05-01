package com.likelion.project1.programmers;

public class AttachNumbersImprove {
    public static int solution(int[] num_list) {
        int ans = 0;
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even *= 10;
                even += num_list[i];
            } else {
                odd *= 10;
                odd += num_list[i];
            }
        }

        return even + odd;
    }
    public static void main(String[] args) {
        int[] num_list = new int[]{3, 4, 5, 2, 1};
        int res = solution(num_list);
        System.out.println("res = " + res);
    }
}
