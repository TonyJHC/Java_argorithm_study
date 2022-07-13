package com.example.algorithm.current.oop.template5.test;

public class SuperLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("ㅂ엄청 빠르게 달랍니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 jump");
    }

    @Override
    public void turn() {
        System.out.println("turn 합니다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println(" ******* 고급자 레벨입니다.");
    }
}
