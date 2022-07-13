package com.example.algorithm.current.oop.template5.test;

public class MainBordPlay {

    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);
        System.out.println("=============");

        PlayerLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        PlayerLevel sLevel =  new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);

    }
}
