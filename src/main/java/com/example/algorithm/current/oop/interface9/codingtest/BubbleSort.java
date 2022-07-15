package com.example.algorithm.current.oop.interface9.codingtest;

public class BubbleSort implements Sort {
    @Override
    public void ascending() {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending() {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void showInfo() {
        System.out.println("BubbleSort입니다.");
    }
}
