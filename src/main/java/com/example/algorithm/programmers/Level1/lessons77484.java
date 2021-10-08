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
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
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
        answer[0] = lottos.length - (correctCnt + zeroCnt) + 1; // 최고 등수
        answer[1] = lottos.length - correctCnt + 1; // 최저 등수

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


/*
참고 : 자바 공홈 https://dev.java/learn/tutorial/mastering-the-api/stream-api/creating-streams.html
   Arrays stream https://jeffrey-oh.tistory.com/160

<스트림>
: '데이터의 흐름'
장점 : 배열 또는 인스턴스에 함수 여러 개를 조합하여 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있음.
    또한 람다를 이용하여 코드의 양을 줄이고 간결하게 표현할 수 있음. ( 배열과 인스턴스를 함수형으로 처리가능 )
    간단하게 병렬처리 ( multi-threading ) 가능. : 하나의 작업을 둘 이상의 작업으로 잘게 나눠서 동시에 진행 -> 쓰레드를 이용하여 많은 요소들을 빠르게 처리가능.

* public int[] solution(int[] lottos, int[] winNums) {
        return LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count()
        )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }
    */
