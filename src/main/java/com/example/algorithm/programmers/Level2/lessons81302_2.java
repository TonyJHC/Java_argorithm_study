package com.example.algorithm.programmers.Level2;


public class lessons81302_2 {

    public int[] solution(String[][] places) {
        int[] answer ={1,1,1,1,1};
        String tmp;
        int cnt = 0;
        char[][][] strc = new char[5][5][5];

        // 3차원 행렬로 변환
        for (int p = 0; p < 5; p++) { // 면
            for (int c = 0; c < 5; c++) { // 열
                tmp = places[p][c];
                for (int r = 0; r < 5; r++) { // 대기실
                    strc[p][r][c] = tmp.charAt(r);
                }
            }
        }
        for (int p = 0; p < 5; p++) { // 대기실
            for (int c = 0; c < 5; c++) { // 열
                tmp = places[p][c];
                for (int r = 0; r < 5; r++) { // 행
                    System.out.print(strc[p][r][c] +" ");
                }
                System.out.println();
            }

            System.out.println();
        }
//
        for (int p = 0; p < 5; p++) { // 대기실
            for (int c = 0; c < 5; c++) { //  행
                for (int r = 0; r < 5; r++) {
                    char cpr = strc[p][r][c];
                    // 1. 같은 행에서 거리 검사
                    for (int i = r + 1; i < 5; i++) {
                        if ((Math.abs(c - c) + Math.abs(r - i)) == 1) {// 거리가 1일때
                            if ((strc[p][r][c] == 'P' && strc[p][r][i] == 'P')) {  // 둘다 자리에 누가 있다면
                                System.out.println(p + ", " + r + ", " + c +"거리 1 : 같은 column에 위치한 좌석 " + strc[p][r][c] + " , " + strc[p][r][i]);
                                answer[p] = 0; // 해당 대기실 방역수칙 어김 : 0

                            }
                        } else if ((Math.abs(c - c) + Math.abs(r - i)) == 2) { // 거리가 2일 때
                            if ((strc[p][r][c] == 'P' && strc[p][r][i] == 'P')) {
                                if ((r + 1) < 5 && strc[p][r][r + 1] != 'X') { // 사이에 파티션이 없다면 ** 주의 : 오버플로우 , 에러안나면 무시
                                    System.out.println(p + ", " + r + ", " + c +"거리 2 : 같은 column에 위치한 좌석 " + strc[p][r][c] + " , " + strc[p][r][c + 1]);
                                    answer[p] = 0; // 해당 대기실 방역수칙 어김 : 0
                                }
                            }
                        }
                    }

                    // 2. 같은 열에서 거리 검사
                    for (int i = c + 1; i < 5; i++) {
                        if (Math.abs(c - i) + Math.abs(r - r) == 1) {// 거리가 1일때
                            if ((strc[p][r][c] == 'P' && strc[p][i][c] == 'P')) {  // 둘다 자리에 누가 있다면
                                System.out.println(p + ", " + r + ", " + c +"거리 1 : 같은 column에 위치한 좌석 " + strc[p][r][c] + " , " + strc[p][i][c]);

                                answer[p] = 0; // 해당 대기실 방역수칙 어김 : 0

                            }
                        } else if (Math.abs(c - i) + Math.abs(r - r) == 2) { // 거리가 2일 때
                            if ((strc[p][r][c] == 'P' && strc[p][i][c] == 'P')) {
                                if ((r + 1) < 5 && strc[p][r + 1][c] != 'X') // 사이에 파티션이 없다면 ** 주의 : 오버플로우 , 에러안나면 무시
                                    System.out.println(p + ", " + r + ", " + c +"거리 2 : 같은 column에 위치한 좌석 " + strc[p][r][c] + " , " + strc[p][i][c]);
                                answer[p] = 0; // 해당 대기실 방역수칙 어김 : 0
                            }
                        }
                    }

                    // 3. 대각선 조사
                    for (int i = 1; i < 5 - r; i++) {
                        if (Math.abs(c - (c + i)) + Math.abs(r - (r + i)) == 2) {// 거리가 2일때
                            if ((c + i) < 5 && (r + i) < 5 && (strc[p][r][c] == 'P' && strc[p][r + i][c + i] == 'P')) {  // 둘다 자리에 누가 있다면
//                                if (strc[p][r + 1][c] != 'X' && strc[p][r][c + 1] != 'X') {
                                System.out.println(p + ", " + r + ", " + c + " 거리 2 : 같은 column에 위치한 좌석 " + strc[p][r][c] + " , " + strc[p][r + i][c + i]);
                                answer[p] = 0; // 해당 대기실 방역수칙 어김 : 0
//                                }
                            }
                        }
                    }//
                }
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        lessons81302_2 lessons81302_2 = new lessons81302_2();
        String[][] places = {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
                {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
                {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
                {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
                {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}};

        int[] answer = lessons81302_2.solution(places);

        System.out.print("[ ");

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + ", ");
        }
        System.out.print("]");


    }
}
