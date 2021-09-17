package com.example.algorithm.Sorting.Bubble;

import com.example.algorithm.AlgorithmApplication;
import org.springframework.boot.SpringApplication;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j);
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] x = {22, 5, 11, 32, 120, 68, 70};

        System.out.println("버블 정력(버전1)");
        System.out.println("요솟수 : " + x.length);


        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);

        }
        System.out.println("오름차순 정렬");
        bubbleSort(x, x.length);

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }


    }

}
