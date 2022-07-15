package com.example.algorithm.current.oop.interface9.openmarket;

public interface Sell {

    void sell();

    default void order(){
        System.out.println("판매 주문");
    }

}
