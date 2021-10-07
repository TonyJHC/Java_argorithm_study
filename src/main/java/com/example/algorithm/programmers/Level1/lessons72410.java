package com.example.algorithm.programmers.Level1;


import java.util.Arrays;


public class lessons72410 {
    public String solution(String new_id) {
        String answer = "";

        // 1단계
        new_id = new_id.toLowerCase();

        String newId2 = "";

        // 2단계
        for (int i = 0; i < new_id.length(); i++) {
            char tmp = new_id.charAt(i);
            if (tmp >= 'a' && tmp <= 'z') // 소문자 일때
                newId2 += tmp; // 추가
            else if (tmp == '-')
                newId2 += tmp;
            else if (tmp == '_')
                newId2 += tmp;
            else if (tmp == '.')
                newId2 += tmp;
        }

        String newId3 = "";
        // 3단계 :  마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        for (int i = 0; i < newId2.length()-1; i++) {
//            char tmp1 = newId2.charAt(i);
//            char tmp2 = newId2.charAt(i+1);

            if (newId2.charAt(i) != '.' || newId2.charAt(i + 1) != '.')
                newId3 += newId2.charAt(i);
        }

//        String newId4 = "";
        // 4단계 : 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(newId3.charAt(0) == '.')
            newId3 = newId3.substring(1);
        else if(newId3.charAt(newId3.length()) == '.')
            newId3 = newId3.substring(0,newId3.length()-1);

        answer =newId3;


/*
        // 5단계
        if (new_id.length() == 0)
            new_id = "a";
        else if (new_id.length() <= 2) { // new_id의 길이가 2이하라면
            while (new_id.length() <= 3)   // 길이가 3이 될때까지
                new_id += new_id.substring(new_id.length()); // 마지막 문자를 반복해서 끝에 붙임.
        }

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
        for (int i = 0; i < resultSwap2.length; i++) {
            while (true) {
                if (resultSwap2[i] == '.' && resultSwap2[i + 1] == '.')
                    i++;
                else {
                    resultSwap1[k++] = resultSwap2[i];
                    break;
                }
            }
        }

        // 4단계 : 맨 처음 "." 제거
        if (resultSwap1[0] == '.') {
            answer = String.valueOf(resultSwap1, 1, 15);
            resultSwap1 = answer.toCharArray();
            if (resultSwap1[resultSwap1.length-1] == '.') { // 마지막에 . 있는지 확인
                answer = String.valueOf(resultSwap1, 0, resultSwap1.length); // 다시 String으로 변환

            }
        } else {
            if (resultSwap1[resultSwap1.length-1] == '.') { // 마지막에 . 있는지 확인
                answer = String.valueOf(resultSwap1, 0, resultSwap1.length-1);

            } else
                answer = String.valueOf(resultSwap1, 0, resultSwap1.length); // 다시 String으로 변환

        }


//        if (resultSwap1[15] == '.') { // 마지막에 . 있는지 확인
//            answer = String.valueOf(resultSwap1, 0, 14);
//        } else {
//            answer = String.valueOf(resultSwap1, 0, 15); // 다시 String으로 변환
//        }

*/
        return answer;
    }

    public static void main(String[] args) {
        lessons72410 lessons72410 = new lessons72410();
        System.out.println("...!@BaT#*..y.abcdefghijklm");

        String result = lessons72410.solution("...!@BaT#*..y.abcdefghijklm");

        // String result = lessons72410.solution("123_.def");
//        String str1 = "123123asdf";
//        char[] str2 = str1.toCharArray();

//        for(int i=0; i<str2.length;i ++){
//            if(str2[i] >= '0' && str2[i] <= '9'){
//                System.out.println("this is 숫자 : "+str2[i]);
//            }
//        }

        System.out.println("after : " + result);

    }
}
