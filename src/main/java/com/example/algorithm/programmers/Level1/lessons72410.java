package com.example.algorithm.programmers.Level1;

import javax.xml.stream.events.Characters;
import java.util.Locale;

public class lessons72410 {
    public String solution(String new_id) {
        String answer = "";
        // 1단계
        String lower = new_id.toLowerCase(); // 내장 함수 사용
        char[] resultSwap1 = lower.toCharArray();
        char[] resultSwap2 = resultSwap1; // 옮길 배열

        // 2단계
        int k = 0;
        for (int i = 0; i < resultSwap1.length; i++) {
            if ((resultSwap1[i] >= 'a' && resultSwap1[i] <= 'z') || (resultSwap1[i] >= '0' && resultSwap1[i] <= '9') || (resultSwap1[i] == '-') || (resultSwap1[i] == '_') || (resultSwap1[i] == '.')) {
                resultSwap2[k++] = resultSwap1[i];
            }
        }

        // 3단계
        k = 0;
        for(int i = 0; i<resultSwap2.length; i++) {
            if (resultSwap2[i] == '.' && resultSwap2[i + 1] == '.') { // 2번 곂칠때
                resultSwap1[k++] = resultSwap2[i++];
                if (resultSwap2[i] == '.' && resultSwap2[i + 1] == '.') // 3번 곂칠때
                    resultSwap1[k++] = resultSwap2[i++];
            }
            else
                resultSwap1[k++] = resultSwap2[i];
        }

//        int i = 0;
//        while (i < resultSwap2.length) {
//            if (resultSwap2[i] == '.' && resultSwap2[i + 1] == '.')
//                resultSwap1[k++] = resultSwap2[i++];
//            else
//                resultSwap1[k++] = resultSwap2[i];
//            i++;
//        }


        answer = String.valueOf(resultSwap1); // 다시 String으로 변환
        return answer;
    }

    public static void main(String[] args) {
        lessons72410 lessons72410 = new lessons72410();
        System.out.println("before : ...!@BaT#*..y.abcdefghijklm");

        String result = lessons72410.solution("...!@BaT#*..y.abcdefghijklm");

//        String str1 = "123123asdf";
//        char[] str2 = str1.toCharArray();

//        for(int i=0; i<str2.length;i ++){
//            if(str2[i] >= '0' && str2[i] <= '9'){
//                System.out.println("this is 숫자 : "+str2[i]);
//            }
//        }

        System.out.println("result : " + result);

    }
}
