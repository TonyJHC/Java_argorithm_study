package com.example.algorithm.Recursive.RecurQ6;

import java.util.Scanner;

public class Q6 {
    static void move(int no, int x, int y) { // 원반 no를 x기둥에서 y기둥으로 옮김

//        String A = "A gidung";
//        String B = "B gidung";
//        String C = "C gidung";

        String ABC[] = {"A", "B", "C"};// 0 1 2

        if (no > 1)
            move(no - 1, x, 6 - x - y); //

        System.out.println("wonban[" + no + "]  " + ABC[x - 1] + " gidung -->" + ABC[y - 1] + " gidung move done");
//x= 1 ,2 ,3 y = 1 , 2, 3

//        if (x == 1 && y == 2)
//            System.out.println("wonban[" + no + "]  " + A + "gidung -->" + B + " gidung move done");
//        else if (x == 1 && y == 3)
//            System.out.println("wonban[" + no + "]  " + A + "gidung -->" + C + " gidung move done");
//        else if (x == 2 && y == 1)
//            System.out.println("wonban[" + no + "]  " + B + "gidung -->" + A + " gidung move done");
//        else if (x == 2 && y == 3)
//            System.out.println("wonban[" + no + "]  " + B + "gidung -->" + C + " gidung move done");
//        else if (x == 3 && y == 1)
//            System.out.println("wonban[" + no + "]  " + C + "gidung -->" + A + " gidung move done");
//        else if (x == 3 && y == 2)
//            System.out.println("wonban[" + no + "]  " + C + "gidung -->" + B + " gidung move done");


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
