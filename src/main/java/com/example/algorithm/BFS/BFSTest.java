package com.example.algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;


public class BFSTest {
    // 움직일 수 있는 네 방향은 미리 배열로 선언해두면
    // 나중에 for문을 이용하여 탐색하기 편합니다.
    // 방문순서는 상우하좌의 순서로 방문하도록 세팅되었습니다.
    private static int[] addRow = { -1, 0, 1, 0 };
    private static int[] addCol = { 0, 1, 0, -1 };
    private static int cnt;
 
    public static void main(String[] args) {
        // BFS를 테스트할 2차원 배열을 생성합니다.
        // 배열을 최초 생성할 경우 배열 안의 값은 모두 0으로 초기화되어있습니다.
        int[][] map = new int[10][10];
 
        // BFS 작업을 위한 Queue를 하나 선언합니다.
        // DFS와 마찬가지로 탐색의 시작점은 좌표 (0, 0) 입니다.
        // 몇 번째로 방문했는지 확인하기 위해 cnt변수를 이용하여 방문순서를 세어보겠습니다.
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(0, 0));
        cnt = 1;
 
        // while 문을 돌면서 Queue가 빌때까지 map의 좌표를 방문하면서 탐색합니다.
        while (!queue.isEmpty()) {
            // Queue에는 탐색 후보노드 정보가 들어있습니다.
            // 하나씩 poll해서 탐색합니다.
            Node node = queue.poll();
 
            // poll해서 얻을  Node객체에서 row와 column 정보를 가져옵니다.
            int row = node.row;
            int col = node.col;
 
            // 이미 탐색된 좌표는 continue로 넘어갑니다.
            if (map[row][col] > 0)
                continue;
 
            // 탐색되지 않은 좌표에는 탐색되었다는 의미에서 cnt값을 부여합니다.
            map[row][col] = cnt++;
            // 네 방향을 for문을 이용해서 탐색합니다.
            for (int i = 0; i < 4; i++) {
                // 다음으로 방문할 좌표는 nextRow와 nextCol입니다.
                int nextRow = row + addRow[i];
                int nextCol = col + addCol[i];
                // 우리가 탐색하려는 map배열 사이즈 안에 들어가는지 확인해봅니다.
                if (nextRow < 0 || nextRow >= map.length || nextCol < 0 || nextCol >= map[nextRow].length
                        // 이미 방문한 좌표라면 굳이 후보노드로 등록할 필요가 없으므로 필터링할 조건에 추가해줍니다.
                        || map[nextRow][nextCol] > 0)
                    continue;
                // 위의 필터링 조건에 걸리지 않았다면 후보노드로서 자격이 있으므로 Queue에 추가해줍니다.
                queue.add(new Node(row + addRow[i], col + addCol[i]));
            }
        }
 
        // 마지막으로 탐색된 순서를 확인해주기 위해서 프린트해줍니다.
        // 마치 물결이 퍼져나가듯 탐색되었다는 것을 확인할 수 있습니다.
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
// Node의 정보를 저장해줄 class를 하나 선언해줍니다.
// 2차원 배열이므로 좌표값은 row, column 두가지가 생깁니다.
// row는 row로 column은 col로 변수명을 주었습니다.
class Node {
    int row;
    int col;
 
    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }
}


// 참고 : https://code0xff.tistory.com/21