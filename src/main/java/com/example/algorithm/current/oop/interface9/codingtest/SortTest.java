package com.example.algorithm.current.oop.interface9.codingtest;

import java.io.IOException;
import java.io.InputStream;

public class SortTest {
    public static void main(String[] args) throws IOException {

        System.out.println("정렬방식을 선택하세요.");
        char ch = (char) System.in.read();

        Sort sort = null;

        if (ch == 'B' || ch == 'b')
            sort = new BubbleSort();
        else if (ch == 'H' || ch == 'h')
            sort = new HeapSort();
        else if (ch == 'Q' || ch == 'q')
            sort = new QuickSort();
        else
            System.out.println("해당 기능은 제공하지 않습니다.");


        sort.defaultMethod();
        sort.ascending();
        sort.descending();
        sort.showInfo();


    }
}
