package com.example.algorithm.programmers.Level1;


import java.util.Arrays;

// 다른 사람 풀이 공부
public class lessons77484 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        int zeroCnt = 0;
        int correctCnt = 0;


        Arrays.sort(lottos); // 0을 빨리 찾기 위해

        // 1. 0의 개수를 찾는 함수 --> 갯수 찾기
        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0)
                zeroCnt++;
        }

        if (zeroCnt == 6) {
            answer[0] = 1;
            answer[1] = 6;
            return answer;
        }

        // 2. 0을 제외한 당첨번호 비교 --> 갯수 찾기
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j])
                    correctCnt++;
            }
        }
        if (correctCnt == 0) { // 맞춘 것이 없다면
            answer[0] = 6;
            answer[1] = 6;
            return answer;
        } else if (correctCnt == 6) { // 모두 일치해서 1등이면
            answer[0] = 1;
            answer[1] = 1;
            return answer;
        }


        //int high = correctCnt + zeroCnt;
        //int low = correctCnt;

        // 3. 결과값 정하기
        answer[0] = 6 - (correctCnt + zeroCnt) + 1; // 최고 등수
        answer[1] = 6 - correctCnt + 1; // 최저 등수

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        lessons77484 lessons77484 = new lessons77484();

        int[] answer = lessons77484.solution(lottos, win_nums);

        System.out.println("result : [" + answer[0] + ", " + answer[1] + "]");


    }

}
