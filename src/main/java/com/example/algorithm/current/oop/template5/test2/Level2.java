package com.example.algorithm.current.oop.template5.test2;

public abstract class Level2 {

    protected abstract void run();

    protected abstract void jump();

    protected abstract void turn();


    final public void go() {
        this.run();
        this.jump();
        this.turn();
    }


}
