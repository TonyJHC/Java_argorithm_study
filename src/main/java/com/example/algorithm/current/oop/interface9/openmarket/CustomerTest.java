package com.example.algorithm.current.oop.interface9.openmarket;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buy();
        customer.order();
        customer.sell();
        customer.sayHell();

        Buy buyer = new Customer();
        buyer.buy();
        buyer.order();


    }
}
