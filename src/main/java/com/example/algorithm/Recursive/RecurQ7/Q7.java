package com.example.algorithm.Recursive.RecurQ7;

import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;

public class Q7 {
    static void move(int no, int x, int y) { // 원반 no를 x기둥에서 y기둥으로 옮김

        IntStack stc1 = new IntStack(no);
        IntStack stc2 = new IntStack(no); // 중간 기둥
        IntStack stc3 = new IntStack(no);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hanoi");
        System.out.println("wonban num : ");
        int n = scanner.nextInt();

        move(n, 1, 3);


    }
}
