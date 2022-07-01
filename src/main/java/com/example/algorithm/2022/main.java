package com.example.algorithm

public class main {
    public static void main(String[] args) {

        MyStack<String> myStack = new MyStack<>();

        myStack.push("first item");
        myStack.push("second item");
        myStack.push("third item");

        while(!myStack.isEmpty())
            System.out.println(myStack.pop());

    }
}
