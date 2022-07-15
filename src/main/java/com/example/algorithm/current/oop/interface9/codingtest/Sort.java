package com.example.algorithm.current.oop.interface9.codingtest;

public interface Sort {

    void ascending();

    void descending();

    default void defaultMethod() {
        System.out.println("숫자를 정렬하는 알고리즘 입니다.");
    }

    void showInfo();


}
