package com.example.algorithm.current.oop.template5.example;

public abstract class Car {

    public abstract void start();

    public abstract void drive();

    public abstract void stop();

    public abstract void turnOff();

//    public void washCar() {
//    }

    final public void run() {
        start();
        drive();
        stop();
        turnOff();
//        washCar();
    }

}
