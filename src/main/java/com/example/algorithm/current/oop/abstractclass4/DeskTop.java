package com.example.algorithm.current.oop.abstractclass4;

public  class DeskTop extends Computer {

    @Override
    public void display() {
        System.out.println("DeskTop display");
    }

    @Override
    public void typing() {
        System.out.println("DeskTop typing");
    }

    @Override
    public void turnOn() {
        System.out.println("DeskTop 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("DeskTop 전원을 끕니다.");
    }
}
