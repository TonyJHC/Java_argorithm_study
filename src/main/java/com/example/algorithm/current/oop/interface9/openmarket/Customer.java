package com.example.algorithm.current.oop.interface9.openmarket;

public class Customer implements Buy, Sell {

    @Override
    public void order() {
//        Buy.super.order();
        System.out.println("customer order");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    public void sayHell() {
        System.out.println("hello");
    }

}
