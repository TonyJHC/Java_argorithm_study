package com.example.algorithm.current.codingTest.linkedList;

public class SingleLinkedList<T> {

    Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head == null)
            head = new Node<>(data);
        else {
            Node<T> node = this.head;
            while (node.next != null)
                node = node.next;

            node.next = new Node<T>(data);
        }
    }

    public void printAllNode() {

        if (head != null) {
            Node<T> tmp = this.head;
            System.out.println(tmp.data);

            while (tmp.next != null) {
                tmp = tmp.next;
                System.out.println(tmp.data);
            }
        }
    }

    public Node<T> search(T isData) {
        if (head == null)
            return null;
        else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData)
                    return node;
                else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode.next == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean deleteNode(T isData) {
        if (this.head == null)
            return false;
        else {
            Node<T> node = this.head;
            if( node.data == isData){
                this.head = this.head.next; // head변경
                return true;
            }else{
                while(node.next != null){
                    if(node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }


}
