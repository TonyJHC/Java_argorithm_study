package com.example.algorithm.current.oop.abstractclass4;

import java.util.ArrayList;

public class ComputerTest {

    public static void main(String[] args) {

        ArrayList<Computer> computers = new ArrayList<>();

        Computer computer = new DeskTop(); // 업캐스팅 : 묵시적
        computers.add(computer);

        Computer computer1 = new MyNoteBook();
        computers.add(computer1);

        NoteBook noteBook = (NoteBook) computer1;
        noteBook.noteBookCustom();

        for(Computer com : computers){
            com.turnOn();
            com.display();
            com.typing();
            com.turnOff();
            System.out.println("==========");
        }
    }
}
