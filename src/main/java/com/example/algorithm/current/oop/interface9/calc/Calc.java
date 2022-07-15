package com.example.algorithm.current.oop.interface9.calc;

public interface Calc {
    // 1. 상수 : 변수는 전부 상수
    double PI = 3.14; // public static final 이 생략되어 있음. 컴파일 과정에서 앞에 붙는다.
    int ERROR = -999999999;

    // 2. 추상 메서드
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);


    public void runCalc(int n1, int n2);


    // 3. default 메서드
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
//        myMethod();
    }

    // 4. static 메서드
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        return total;
    }

    // private 메소드는 java 9(?)부터 사용됨. 지금 jdk 1.8이라서 안됨.
//    private void myMethod(){
//        System.out.println("private method");
//    }

}
