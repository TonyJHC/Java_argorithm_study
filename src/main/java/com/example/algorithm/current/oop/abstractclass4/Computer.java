package com.example.algorithm.current.oop.abstractclass4;

public abstract class Computer {

    // 하위 클래스에 따라서 display , typing 방식이 달라짐 ex) 노트북과 패드의 차이
    public abstract void display();

    public abstract void typing();

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }

}
