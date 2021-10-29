package com.example.algorithm.programmers.Level2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Node { // node 정보 저장
    int row;
    int col;

    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class lessons1829 {

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int[] moveRow = {-1, 0, 1, 0}; // 상하 이동
        int[] moveCol = {0, 1, 0, -1}; // 좌우 이동

        Map<Integer, Integer> areaMap = new HashMap<Integer, Integer>(); // 영역 몇개인지 저장

        areaMap.put(0, 0);
        int cnt = 0;
        int colorCnt = 0;


        boolean[][] visited = new boolean[m][n]; // 방문 여부 배열 ( 기본 값 false )


        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[0].length; j++) {
                Queue<Node> queue = new LinkedList<Node>();

                if (visited[i][j] != true) {
                    queue.add(new Node(i, j)); // 후보노드 하나

                    while (!queue.isEmpty()) {
                        Node node = queue.poll(); // 꺼내고 제거 , 첫 시작값음 (0,0)

                        // 후보 노드 row, col
                        int row = node.row;
                        int col = node.col;
                        int nextRow = 0;
                        int nextCol = 0;

                        if (picture[row][col] == 0) // 색칠 x 구간 : 0
                            continue;

                        for (int k = 0; k < 4; k++) { // 상하좌우 비교하기
                            nextRow = row + moveRow[k]; // 상하 이동후 좌표
                            nextCol = col + moveCol[k]; // 좌우 이동후 좌표

                            // 상하좌우 이동후 좌표 검사 : 인덱스 넘어가거나 이미 방문한 노드라면
                            if (nextRow >= m || nextCol >= n || nextCol <= 0 || nextRow <= 0 || visited[nextCol][nextCol] == true)
                                continue; // 더이상 탐색 x

                            else if (picture[row][col] == picture[nextRow][nextCol]) { // 같은 색이라면
                                System.out.print("같은 색 ");
                                int key = picture[row][col];
                                if (areaMap.containsKey(key)) { // 이미 해당 색이 map 에 들어있다면
                                    System.out.println("--------");
                                    areaMap.replace(key, areaMap.get(key) + 1); // 영역(색)의 개수인 value 값 +1 ,

                                } else // 없다면
                                    areaMap.put(picture[row][col], 1); // 영역(색) 추가


                            }


                        }

                        if (nextRow >= m || nextCol >= n || nextCol <= 0 || nextRow <= 0 || visited[nextCol][nextCol] == true)
                            continue; // 더이상 탐색 x
                        else {
                            visited[nextRow][nextCol] = true; // 방문노드 true 설정
                            queue.add(new Node(nextRow, nextCol));
                        }


                        for (Map.Entry<Integer, Integer> entry : areaMap.entrySet()) {
                            System.out.print(entry + " / ");
                        }

                        System.out.println();
                    }
                }
            }
        }


        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public static void main(String[] args) {
        lessons1829 lessons1829 = new lessons1829();

        int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        lessons1829.solution(6, 4, picture);
    }
}
