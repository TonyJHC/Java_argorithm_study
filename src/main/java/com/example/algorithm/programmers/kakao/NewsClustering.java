package com.example.algorithm.programmers.kakao;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class NewsClustering {

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
    public void printSet(List<String> multiSet){

        System.out.println();
        System.out.println("------------------");
        for (String print : multiSet) {
            System.out.print(print);
            System.out.print(", ");
        }
        System.out.println();
    }

    public int Jaccard(List<String> multiSet1, List<String> multiSet2){

        int emptySet =0; // 공집합
        int unionSet =0; // 합집합
        List<String> unionSetList = new ArrayList<>();
        for(int i=0; i<multiSet1.size(); i++){
            if(!unionSetList.contains(multiSet1.get(i))) // 중복이 없으면
                unionSetList.add(multiSet1.get(i)); // 합집합에 추가
            for(int k=0; k < multiSet2.size(); k ++){
                if(multiSet1.get(i) )

            }


        }

        return 1;
    }

    public int solution(String str1, String str2) {
        int answer = 0;

//        String tmp1 = str1.replaceAll("[^a-z]","");
        str1 = str1.toLowerCase(Locale.ROOT); // 소문자로 통일
        str2 = str2.toLowerCase(Locale.ROOT); // 소문자로 통일

        System.out.println(str1);
        List<String> multiSet1 = setCalculator(str1);
        List<String> multiSet2 = setCalculator(str2);

        printSet(multiSet1);
        printSet(multiSet2);

        answer = Jaccard(multiSet1,multiSet2);


        return answer;
    }

    public static void main(String[] args) {

        NewsClustering newsClustering = new NewsClustering();

        newsClustering.solution("aa1+aa2", "AAAA12");

    }

}

