package com.example.algorithm.current.oop.template5.example;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스모 멈춥니다.");
    }

    @Override
    public void turnOff() {

    }

    @Override
    public void start() {
        System.out.println("자율주행차 시동을 켭니다.");
    }

//    @Override
//    public void washCar() {
//        System.out.println("자동 세차 합니다.");
//    }

}
