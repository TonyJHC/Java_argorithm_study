package com.example.algorithm.current.oop.template5.example;

public class ManualCar extends Car {

    @Override
    public void drive() {
        System.out.println("달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("멈춥니다");
    }

    @Override
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    @Override
    public void start() {
        System.out.println("시동을 켭니다.");
    }


}
