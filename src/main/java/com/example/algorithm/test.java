package com.example.algorithm;

import java.util.Scanner;

public class test {
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        recur(3);
    }

}
