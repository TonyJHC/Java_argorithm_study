package com.example.algorithm.current.codingTest.queue;


import java.util.ArrayList;


public class MyQueue<T>{

    ArrayList<T> queue ;

    public MyQueue() {
        queue =new ArrayList<T>();

    }

    public void enqueue(T item){
        queue.add(item);
    }

    public T dequeue(){
        if(queue.isEmpty())
            return null;
        return queue.remove(0);
    }

    public boolean isEmpty(){
        if (queue.isEmpty())
            return true;

        return false;
    }
}