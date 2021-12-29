package com.example.algorithm.programmers.kakao;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NewsClustering {

    // 부분집합 만들기 함수
    public List<String> setCalculator(String str) {
        List<String> multiSet = new ArrayList<>();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            String tmpstr = "";
            if (i + 1 == charArray.length)
                break;
            if (charArray[i] >= 'a' && charArray[i] <= 'z' && charArray[i + 1] <= 'z' && charArray[i + 1] >= 'a') { // 둘다 알파벳일때
                System.out.print("[" + charArray[i] + ", " + charArray[i + 1] + "]");
                tmpstr += charArray[i];
                tmpstr += charArray[i + 1];
                multiSet.add(tmpstr);
            }
        }
        return multiSet;
    }

    // 그냥 확인용 출력함수
    public void printSet(List<String> multiSet) {

        System.out.println();
        System.out.println("------------------");
        for (String print : multiSet) {
            System.out.print(print);
            System.out.print(", ");
        }
        System.out.println();
    }

    // 합집합 교집합 만들기 , 자카드 유사도 계산
    public int Jaccard(List<String> multiSet1, List<String> multiSet2) {

        if (multiSet1.size() == 0 && multiSet2.size() == 0) // 집합 A,B가 모두 공집합일 경우
            return 1 * 65536;

        // multiSet1의 요소 합집합 추가
        List<String> unionSetList = new ArrayList<>();
        for (String tmp : multiSet1) {
            unionSetList.add(tmp);
        }
        int interCnt = 0; // 교집합
        int unionCnt = unionSetList.size(); // 합집합


        // 교집합 만들기
        for (int i = 0; i < multiSet1.size(); i++) {
            if (i == multiSet1.size())
                break;
            for (int k = 0; k < multiSet2.size(); k++) {
                if (multiSet1.get(i).equals(multiSet2.get(k))) { // 교집합 조건
                    interCnt++; // 교집합 카운트 ++
                    multiSet2.remove(k); // 중복을 위해 비교 대상이 multiSet2 에서 제거하기
                    break; // 인덱스 뛰어넘기
                }
            }
        }

        // 합집합 만들기
        for (String tmp : multiSet2) { // multiSet1 과 mutliSet2 의 교집합을 제외한 나머지 mutliSet2의 요소들 합집합에 추가
            unionSetList.add(tmp);
            unionCnt++;
        }
        // 자카드 유사도 계산
        System.out.println("교집합 : " + interCnt);
        System.out.println("합집합 : " + unionCnt);
        System.out.println(unionSetList.size());
        int result = (interCnt * 65536) / unionCnt;

        return result;
    }

    public int solution(String str1, String str2) {
        int answer = 0;

//        String tmp1 = str1.replaceAll("[^a-z]","");
        str1 = str1.toLowerCase(Locale.ROOT); // 소문자로 통일
        str2 = str2.toLowerCase(Locale.ROOT); // 소문자로 통일

        System.out.println(str1);
        List<String> multiSet1 = setCalculator(str1);

        System.out.println(str2);
        List<String> multiSet2 = setCalculator(str2);

        printSet(multiSet1);
        printSet(multiSet2);

        answer = Jaccard(multiSet1, multiSet2);


        return answer;
    }

    public static void main(String[] args) {

        NewsClustering newsClustering = new NewsClustering();

        int result = newsClustering.solution("handshake", "shake hands");
        System.out.println("자카도 계산 : " + result);
    }

}

