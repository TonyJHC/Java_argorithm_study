package com.example.algorithm.current.oop.interface9.extendsandimplements;

public class BookTest {

    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();

        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");
        bookQueue.enQueue("태백산맥4");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());


    }
}
