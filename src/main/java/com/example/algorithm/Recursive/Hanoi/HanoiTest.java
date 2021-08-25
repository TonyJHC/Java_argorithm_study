package com.example.algorithm.Recursive.Hanoi;

import java.util.Scanner;

public class HanoiTest {
    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y); //

        System.out.println("wonban[" + no + "]  " + x + "gidung -->" + y + "gidung move done");

        if (no > 1)
            move(no - 1, 6 - x - y, y); // 중간에 쉬어가는 기둥식 : 6 - x - y

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hanoi");
        System.out.println("wonban num : ");
        int n = scanner.nextInt();

        move(n, 1, 3);


    }
}
