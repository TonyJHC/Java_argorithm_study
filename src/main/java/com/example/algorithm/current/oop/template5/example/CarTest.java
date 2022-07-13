package com.example.algorithm.current.oop.template5.example;


import java.util.ArrayList;


public class CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList = new ArrayList<Car>();


        carArrayList.add(new Sonata());
        carArrayList.add(new Avante());

        for (Car car : carArrayList){
            car.run();
            System.out.println("======================");
        }
    }


}
