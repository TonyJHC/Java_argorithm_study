package com.example.algorithm.Recursive.RecurQ5;

import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;

public class Q5 {
    static void recur3(int n) {
        if (n > 0) {
            recur3(n - 1);
            recur3(n - 2);
            System.out.println(n);
        }
    }

    static void recur1(int n) {
        IntStack stack = new IntStack(n);

        while (true) {
            if (n > 0) { // stack에 쌓아놓기
                stack.push(n);
                n = n - 1;
                continue;
            }

            if (stack.empty() != true) {
                n = stack.pop();
                System.out.println(n);
                n = n - 1;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("data input");
        int x = scan.nextInt();

        recur1(x);
        System.out.println("====================");
        recur3(x);
    }

}
