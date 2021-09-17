package com.example.algorithm.Sorting.Simple;

import java.util.Scanner;

public class InsertSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void insertSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];
            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] x = {22, 5, 11, 32, 120, 68, 70};

        System.out.println("선택 정렬(버전1)");
        System.out.println("요솟수 : " + x.length);


        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);

        }
        System.out.println("오름차순 정렬");

        insertSort(x, x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
