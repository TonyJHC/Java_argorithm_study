package com.example.algorithm;

import java.util.ArrayList;

public class MyStack<T>{

    private ArrayList<T> arrayList ;

    public MyStack(){
        arrayList = new ArrayList<T>();
    }

    public void push(T item){
        arrayList.add(item);
    }

    public T pop(){
        if (arrayList.isEmpty())
            return null;
        return arrayList.remove(arrayList.size()-1);
    }

    public boolean isEmpty(){
        if (arrayList.isEmpty())
            return true;
        return false;
    }
}
