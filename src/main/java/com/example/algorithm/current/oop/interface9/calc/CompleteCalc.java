package com.example.algorithm.current.oop.interface9.calc;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {

        if (num2 == 0)
            return ERROR;

        return num1 / num2;
    }

    public void showInfo() {
        System.out.println("모두 구현하였습니다.");
    }

    @Override
    public void description() {
        System.out.println("재정의 한 description()");
    }

    final public void runCalc(int n1, int n2) {
//        super.description();
        this.description();
        System.out.println(this.add(n1, n2));
        System.out.println(this.substract(n1, n2));
        System.out.println(this.divide(n1, n2));
        System.out.println(this.times(n1, n2));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Calc.total(arr));
        showInfo();
    }
}
