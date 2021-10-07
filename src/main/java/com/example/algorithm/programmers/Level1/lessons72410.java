package com.example.algorithm.programmers.Level1;


import java.util.Arrays;


public class lessons72410 {
    public String solution(String new_id) {
        String answer = "";


        // 1단계
        new_id = new_id.toLowerCase();

        System.out.println(new_id);

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
        System.out.println(newId2);

        String newId3 = "";
        // 3단계 :  마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        for (int i = 0; i < newId2.length() - 1; i++) {
//            char tmp1 = newId2.charAt(i);
//            char tmp2 = newId2.charAt(i+1);

            if (newId2.charAt(i) != '.' || newId2.charAt(i + 1) != '.')
                newId3 += newId2.charAt(i);
        }
        System.out.println(newId3);

//        String newId4 = "";
        // 4단계 : 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if (newId3.charAt(0) == '.')
            newId3 = newId3.substring(1);
        else if (newId3.charAt(newId3.length() - 1) == '.')
            newId3 = newId3.substring(0, newId3.length() - 1);

        System.out.println("4단계 이후 : " + newId3);

//        answer =newId3;

        // 5단계 : new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (newId3.length() == 0) {
            newId3 = "a";
        } else if (newId3.length() >= 16) { // 6단계 : new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
            newId3 = newId3.substring(0, 15);
            if (newId3.charAt(14) == '.')//     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
                newId3 = newId3.substring(0, newId3.length() - 1);
        }

        System.out.println("5, 6 단계 이후 : " + newId3);

        // 7단계
        if (newId3.length() <= 2) {
            char a = newId3.charAt(newId3.length() - 1);
            while (newId3.length() <= 3)
                newId3 += a;
        }

        System.out.println(newId3);

        answer = newId3;

        return answer;
    }

    public static void main(String[] args) {
        lessons72410 lessons72410 = new lessons72410();
        System.out.println("...!@BaT#*..y.abcdefghijklm");

        String result = lessons72410.solution("z-+.^.");
        System.out.println("after : " + result);

    }
}
