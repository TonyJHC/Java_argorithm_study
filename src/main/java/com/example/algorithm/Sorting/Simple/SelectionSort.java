package com.example.algorithm.Sorting.Simple;

import java.util.Scanner;

public class SelectionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) // 아직 정렬되지 않은 부분
                if (a[j] < a[min])  // 정렬되지 않은부분의 첫번째 요소와 a[min] 비교
                    min = j;

            swap(a, i, min);
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

        selectionSort(x, x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
