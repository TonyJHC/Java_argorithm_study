package com.example.algorithm.programmers.Level1;

public class test {

    public static void main(String[] args) {
        String str1 = "...!@BaT#*..y.abcdefghijklm";

        System.out.println(str1.length());
        System.out.println(str1);

        str1 = str1.replace("..",".");
        System.out.println(str1.length());
        System.out.println(str1);

        str1 = str1.substring(0,str1.length()-1);
        System.out.println(str1);
    }
}
