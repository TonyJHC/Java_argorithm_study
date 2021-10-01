package com.example.algorithm.programmers;


public class lessons12940 {
    public String solution(String phone_number) {

        String answer = "";

        for (int i = 0; i < phone_number.length() - 4; i++) { // 맨 뒷자리 4자리 남겨두고
            answer = answer.concat("*"); // 앞에는 전부 *로 채우기
        }
        //String sub = phone_number.substring(phone_number.length()-4); // 핸드폰 번호의 끝자리 4자리 추출 임시저장
        answer = answer.concat(phone_number.substring(phone_number.length()-4));

        return answer;
    }

    public static void main(String[] args) {

        lessons12940 lessons12940_2 = new lessons12940();
        String answer = lessons12940_2.solution("01094460770");

        System.out.println("answer :  " + answer);

    }

}


/*
<< 프로그래머스 다른 풀이>>
*  class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i ++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }


 toCharArray() 를 생각도 못했음.
 문자열을 한 글자씩 쪼개서
이를 char타입의 배열에 집어넣어주는 친절한 메소드이다.
valueOf : 다시 String 객체로 만들어줌.

}*/
