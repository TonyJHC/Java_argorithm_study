package com.example.algorithm.programmers.Level2;

import com.example.algorithm.programmers.Level1.lessons77484;

import java.util.ArrayList;
import java.util.Arrays;

public class lessons60057 {
    public int solution(String s) {
        int answer = 0;
//        s.substring(k,k+i+i);
        String[] str = new String[s.length() / 2 + 1]; // 자르는 단위만큼 String 객체 수가 정해질테니까.
        int[] lengths = new int[str.length ];

        int cnt = 0;
        for (int i = 1; i <= s.length() / 2; i++) { // 자르는 단위
            str[i] = "";
            cnt = 1; // 개수 초기화
//
            for (int k = 0; k < s.length(); k += i) {
                if (k + i + i > s.length()) {
                    if (cnt > 1)
                        str[i] += (cnt + s.substring(k, k + i));
                    else
                        str[i] += s.substring(k, s.length());
                    break;
                }
                if (s.substring(k, k + i).equals(s.substring(k + i, k + i + i))) { // 단위로 자른 요소들 비교 (옆에 있는 것 끼리)

                    cnt++;
                } else { // 다를 때
                    if (cnt > 1) { // 앞에서 같을 때 카운터가 올라가있으면
                        str[i] += (cnt + s.substring(k, k + i));  // 카운터 포함 추가해주기
                        cnt = 1;
                    } else // 카운터가 안올라 가있음 -> 앞에서 같은 문자열이 없었음
                        str[i] += s.substring(k, k + i); // 그대로 넣음
                }

            }
        }

        lengths[0] = str.length;
        for (int i = 1; i <str.length; i++) {
            System.out.println(i + " 개 단위로 압축 : " + str[i]);
            lengths[i] = str[i].length();
            System.out.println("길이 : " + lengths[i]);
        }

        int min = lengths[1]; //최소값

        for(int i=1;i<lengths.length;i++) {

            if(min>lengths[i]) {
                //min의 값보다 array[i]이 작으면 min = array[i]
                min = lengths[i];
            }
        }
        answer = min;


        return answer;


    }

    public static void main(String[] args) {
        lessons60057 lessons60057 = new lessons60057();

        int answer = lessons60057.solution("abcabcdede");
        System.out.println("answer is " + answer);
    }

}
