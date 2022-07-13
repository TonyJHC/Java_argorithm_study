package com.example.algorithm.current.oop.template5.test2;

import java.util.logging.Level;

public  class Player2 {

    private Level2 level2;

    public Player2(Level2 level2){
        this.level2 = level2;
    }

    final public void go(){
        this.level2.go();
    }
}
