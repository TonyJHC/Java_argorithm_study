package com.example.algorithm.current.oop.abstractclass4;

public class MyNoteBook extends NoteBook{

    @Override
    public void display() {
        System.out.println("MyNoteBook display");
    }


    @Override
    public void turnOn() {
        System.out.println("MyNoteBook 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("MyNoteBook 전원을 끕니다.");
    }

    @Override
    public void noteBookCustom() {
        super.noteBookCustom();
        System.out.println(" : MyNoteBook");
    }
}
