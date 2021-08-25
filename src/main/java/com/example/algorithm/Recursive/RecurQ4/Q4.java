package com.example.algorithm.Recursive.RecurQ4;


import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;

public class Q4 {
    static void recur1(int n) {
        IntStack stack = new IntStack(n);

        while (true) {
            if (n > 0) {
                stack.push(n);
                n = n - 1;
                continue;
            }

            if (stack.empty() != true) {
                n = stack.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("data Input : ");
        int x = scan.nextInt();

        recur1(x);
    }

}
