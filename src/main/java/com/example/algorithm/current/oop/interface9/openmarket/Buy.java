package com.example.algorithm.current.oop.interface9.openmarket;

public interface Buy {

    void buy();

    default void order(){
        System.out.println("구매 주문");
    }
}
