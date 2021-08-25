package com.example.algorithm.Recursive.NoRecursive;

public class Q3 {
    public static int gcdArray(int[] a)  {
        if(a.length <= 1)
            System.out.println("error");

        System.out.println("1----------------");

        while(true) {
            if(a[0]<a[1]){
                int i = a[0];
                a[0] = a[1];
                a[1] = i;
            }

//            int cnt = 2;
//            while(cnt <= a.length) { /////////////
////
//                cnt++



            System.out.println("2----------------");

            int min = a[0]%a[1];

            a[0] = a[1];
            a[1] = min;

            System.out.println("3---------------");

            if (min == 0) {
                return a[0];
            }

            System.out.println("4----------------");

        }
//        return a[0];
    }

    public static void main(String[] args) {

        int[] a = new int[] {120,8};
        int result = gcdArray(a);
        System.out.println("result = "+ result);


    }

}
