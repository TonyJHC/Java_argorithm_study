package com.example.algorithm.current.codingTest.linkedList;

public class DoubleLinkedList<T> {

    Node<T> head = null;
    Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) {
            head = new Node<T>(data);
            this.tail = this.head;
        } else if (head == tail) { // 데이터 하나일 때
            tail = new Node<T>(data);
            head.next = tail;
        } else if (head.next == tail) { // 데이터 2개일 때
            head.next = new Node<T>(data); // head와 연결
            head.next.next = tail; // tail과 연결
        } else { // 데이터 3개 이상
            Node<T> node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            tail = node.next;
        }
    }

    public void printAll() {
        Node<T> node = head;
        if (node == null) {
            System.out.println("no data");
        } else {
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData) {
        if (head == null) {
            return null;
        }

        Node<T> node = head;
        while (node != null) {
            if (node.data == isData)
                return node.data;
            node = node.next;
        }
        return null;
    }

    public T searchFromTail(T isData) {
        if (tail == null) {
            return null;
        } else {
            Node<T> node = tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }

    public boolean insertToFront(T existedData, T addData) {

        if (head == null) { // 노드 없을 때
            head = new Node<>(addData);
            tail = head;
            return true;
        } else if (head.data == existedData) { // 맨앞에 있을 때
            Node<T> node = head;
            node.next = head.next; // 기존 헤드 재연결
            head = new Node<>(addData); // 새로운 노드 head 설정
            return true;
        } else if (tail.data == existedData) { // 맨뒤에 있을 때
            Node<T> node = tail;
            node.next = new Node<>(addData);
            tail = node.next;
            return true;
        } else {
            Node<T> node = head.next;
            while (node != null) {
                if (node.data == existedData) {
                    Node<T> nodePrev = node.prev;
                    nodePrev.next = new Node<>(addData); // 새노드 생성
                    nodePrev.next.next = node;
                    node.prev = nodePrev.next;
                    node.next = nodePrev;

                    return true;
                }
                node = node.next;
            }
            return false;
        }


    }

    public static void main(String[] args) {

    }
}
