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
            else if (tmp >= '0' && tmp <= '9')
                newId2 += tmp;
        }


        // 3단계 :  마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        newId2 = newId2.replace("..", ".");
        while (newId2.contains("..")) {
            newId2 = newId2.replace("..", ".");
        }

        // 4단계 : 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (newId2.charAt(0) == '.')
            newId2 = newId2.substring(1);
        else if (newId2.charAt(newId2.length() - 1) == '.')
            newId2 = newId2.substring(0, newId2.length() - 1);


        // 5단계 : new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (newId2.length() == 0) {
            newId2 += "a";
        }
        if (newId2.length() >= 16) { // 6단계 : new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
            newId2 = newId2.substring(0, 15);
        }

        if (newId2.charAt(newId2.length() - 1) == '.')//     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
            newId2 = newId2.substring(0, newId2.length() - 1);


        // 7단계
        if (newId2.length() <= 2) {
            char a = newId2.charAt(newId2.length() - 1);
            while (newId2.length() < 3) {
                newId2 += a;
            }
        }


        answer = newId2;

        return answer;
    }

    public static void main(String[] args) {
        lessons72410 lessons72410 = new lessons72410();
        System.out.println("before : ...!@BaT#*..y.abcdefghijklm");

        String result = lessons72410.solution("123_.def");
        System.out.println("after : " + result);

    }
}
