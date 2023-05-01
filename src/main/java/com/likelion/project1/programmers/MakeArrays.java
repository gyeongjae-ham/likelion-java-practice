package com.likelion.project1.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class MakeArrays {
    public static int[] solution(int l, int r) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean flag = true;
            int tmp = i;
            while (tmp > 0) {
                if (tmp % 10 != 0 && tmp % 10 != 5) {
                    flag = false;
                    break;
                }
                tmp /= 10;
            }
            if (flag) res.add(i);
        }

        int[] answer = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            answer[i] = res.get(i);
        }

        if (answer.length == 0) {
            answer = new int[]{-1};
            return answer;
        } else {
            return answer;
        }
    }

    public static void main(String[] args) {
        int l = 10;
        int r = 20;
        int[] solution = solution(l, r);

        System.out.println(Arrays.toString(solution));
    }
}
