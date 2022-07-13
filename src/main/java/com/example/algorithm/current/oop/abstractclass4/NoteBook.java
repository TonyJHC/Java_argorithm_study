package com.example.algorithm.current.oop.abstractclass4;

public abstract class NoteBook extends Computer{

    @Override
    public void typing() {
        System.out.println("NoteBook typing");
    }

    public void noteBookCustom(){
        System.out.print("노트북에만 있는 기능");
    }
}
