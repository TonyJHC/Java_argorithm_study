package com.example.algorithm.BFS;


import java.util.*;

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent; // 인접 노드와의 관계 ( 자식 )
        boolean marked; // 해당 노드 방문 유무

        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }

    Node[] nodes;  // 노드들 저장

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }

    void addEdge(int i1, int i2) {// 두 노드의 관계를 저장하는 함수
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];
        if (!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    // DFS
    void dfs() {
        dfs(0); // 인자 없으면 시작 노드부터
    }

    // DFS : Stack
    void dfs(int index) { // 시작노드 인자로 받아서 순회 결과 출력하는 함수
        Node root = nodes[index]; // 인덱스로 노드 가져오기
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true; // 방문했음을 표시
        while(!stack.empty()){
            Node r = stack.pop() ; // 스택에서 데이터 pop
            for (Node n : r.adjacent){
                if(n.marked == false){ // stack에 추가되지 않은 노드들만 추가
                    n.marked =true; // 방문 표시
                    stack.push(n);
                }
            }
            visit(r); // 출력
        }
    }

    // DFS : Recursive
    void dfsR(Node r){
        if(r == null) return;
        r.marked = true;
        visit(r);
        for(Node n : r.adjacent){
            if(n.marked == false){
                dfsR(n);
            }
        }
    }

    // DFS : Recursive : array
    void dfsR(int index){
        Node r = nodes[index];
        dfsR(r);

    }

    void dfsR(){
        dfsR(0);
    }



    // BFS : Queue
    void bfs(int index){
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root); // 시작할 노드 큐에 추가
        root.marked = true; // 방문

        while(!queue.isEmpty()){
            Node r = queue.poll(); // 꺼내기
            for(Node n : r.adjacent){ // 인접한 노드(자식)로 이동 : 인접(자식) 노드 queue에 추가하기 위해
                if(n.marked == false){ // 방문한적 없다면
                    n.marked = true; // 방문 했음을 알림
                    queue.offer(n); // 큐에 추가
                }
            }
            visit(r); // 큐에서 poll한 노드 출력
        }

    }
    void bfs(){
        bfs(0); // 인자 없으면 시작 노드부터
    }


    void visit(Node n){ // 출력함수
        System.out.print(n.data + " ");
    }




}

public class GraphTest {

    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);
        Graph g2 = new Graph(9);
        g2.addEdge(0,1);
        g2.addEdge(1,2);
        g2.addEdge(1,3);
        g2.addEdge(2,4);
        g2.addEdge(3,4);
        g2.addEdge(3,5);
        g2.addEdge(5,6);
        g2.addEdge(5,7);
        g2.addEdge(6,8);

        Graph g3 = new Graph(9);
        g3.addEdge(0,1);
        g3.addEdge(1,2);
        g3.addEdge(1,3);
        g3.addEdge(2,4);
        g3.addEdge(3,4);
        g3.addEdge(3,5);
        g3.addEdge(5,6);
        g3.addEdge(5,7);
        g3.addEdge(6,8);

        System.out.println("----DFS----");
        g.dfs();
        System.out.println();
        System.out.println("----DFS:R----");
        g3.dfsR();
        System.out.println();
        System.out.println("----BFS----");
        g2.bfs();
        System.out.println();

    }

}
