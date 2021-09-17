package com.example.algorithm.programmers;


import org.apache.ibatis.annotations.Delete;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class lessons12954 {
//    static int cnt = 0;

    static List solution(int x, int n) {
        if ((x <= -10000000 || x >= 10000000) || n > 1000) {
            System.out.println("잘못된 입력");
            exit(0);
        }
        List list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            list.add(x * i);
        }
        return list;

    }

    public static void main(String[] args) {
        List list = solution(3, 200);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list[" + i + "] : " + list.get(i));
        }
    }

}
