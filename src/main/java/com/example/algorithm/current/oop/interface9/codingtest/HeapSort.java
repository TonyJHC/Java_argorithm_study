package com.example.algorithm.current.oop.interface9.codingtest;

public class HeapSort implements Sort{
    @Override
    public void ascending() {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending() {
        System.out.println("HeapSort descending");
    }

    @Override
    public void showInfo() {
        System.out.println("HeapSort입니다.");
    }
}
