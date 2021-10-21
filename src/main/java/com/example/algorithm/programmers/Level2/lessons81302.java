package com.example.algorithm.programmers.Level2;

public class lessons81302 {

    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        String tmp;
        int cnt =0;
        char[][] strc = new char[5][5];
        //

        while(cnt < 5) {
            for (int i = 0; i < 5; i++) { // 대기실 이동
                for (int k = 0; k < 5; k++) { //  i 번째 대기실 row

                    tmp = places[i][k]; // 임시저장

                    // 인덱스화 : 맨해튼 공식 쓰기 위해  ( |r1 - r2| + |c1-c2| )
                    // 5 x 5 대기실 하나 만들기
                    for (int j = 0; j < 5; j++) {
                        strc[k][j] = tmp.charAt(j);
                        System.out.print(strc[k][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

            // 대기실 조사
            for (int i = 0; i < 5; i++) { // 행
                for (int k = 0; k < 5; k++) { // 열

                    ///// 행, 열, 대각선 조사 /////
                    //int j = k;

                    /*
                     * row 옮길때마다 행, 열, 대각선 조사*/
                    for (int j = k; j < 5; j++) { //
//                    System.out.println(cnt++ +")"+"i : "+ i+", j : "+j+", k : "+k);
                        // 1. 같은 row 에 위치한 좌석들끼리 비교
                        if ((Math.abs(i - i) + Math.abs(k - j)) == 1) { // 거리 1 일때
                            if ((strc[i][k] == 'P' && strc[i][j] == 'P')) {  // 둘다 자리에 누가 있다면

                                System.out.println("거리 1 : 같은 row 위치한 좌석 P P");
                                answer[i] = 0; // 해당 테이블 방역수칙 어김 => 0
                            }
                        } else if (((Math.abs(i - i) + Math.abs(k - j)) == 2)) { // 거리 2 일때
                            if ((strc[i][k] == 'P' && strc[i][j] == 'P')) {
                                System.out.println("거리 2 : 같은 row 위치한 좌석 P P");
                                if (strc[i][k + 1] != 'X') // 사이에 파티션이 없다면
                                    answer[i] = 0; // 해당 테이블 방역수칙 어김 => 0
                            }
                        }
                        // 2. 같은 column 에 위치한 좌석들끼리 비교
                        if ((Math.abs(i - j) + Math.abs(k - k)) == 1) { // 거리 1 일때
                            if ((strc[i][k] == 'P' && strc[j][k] == 'P'))  // 둘다 자리에 누가 있다면
                                answer[i] = 0; // 해당 테이블 방역수칙 어김 => 0

                        } else if (((Math.abs(i - j) + Math.abs(k - k)) == 2)) { // 거리 2 일때
                            if ((strc[i][k] == 'P' && strc[j][k] == 'P'))
                                if ((i + 1) != 5 && strc[i + 1][k] != 'X') // 사이에 파티션이 없다면
                                    answer[i] = 0; // 해당 테이블 방역수칙 어김 => 0

                        }
                        // 3. 같은 대각선에 위치한 좌석들끼리 비교
                        if (i + j >= 5 || k + j >= 5) // 인덱스 넘어가기 방지
                            continue;
                        if ((Math.abs(i - (i + j)) + Math.abs(k - (k + j)) == 1)) { // 거리 1 일때
                            if ((strc[i][k] == 'P' && strc[i + j][k + j] == 'P'))  // 둘다 자리에 누가 있고
                                if (strc[i][k + 1] != 'X' && strc[i + 1][k] != 'X') // 파티션 2개가 없다면
                                    answer[i] = 0; // 해당 테이블 방역수칙 어김 => 0

                        } else if ((Math.abs(i - j) + Math.abs(k - (k + j)) == 2)) { // 거리 2 일때
                            if ((strc[i][k] == 'P' && strc[i + j][k + j] == 'P'))
                                if (strc[i + 1][k + 1] != 'X') // 사이에 파티션이 없다면
                                    answer[i] = 0; // 해당 테이블 방역수칙 어김 => 0

                        }

                    }
//                System.out.println("=============== ");

                    System.out.println(strc[4][3] + "   " + strc[4][4]);
                }

//            if(answer[i]!=0)
//                answer[i]=1;
            }

            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        lessons81302 lessons81302 = new lessons81302();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        int[] answer = lessons81302.solution(places);

        System.out.print("[ ");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }
        System.out.print("]");


    }
}
