package com.example.algorithm.current.oop.interface9.codingtest;

public class QuickSort implements Sort{
    @Override
    public void ascending() {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending() {
        System.out.println("QuickSort descending");
    }

    @Override
    public void showInfo() {
        System.out.println("QuickSort입니다.");
    }
}
