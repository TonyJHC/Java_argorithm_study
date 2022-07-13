package com.example.algorithm.current.oop.template5.test;

public class Player {

    // 객체 지향적으로 설계해야 확장성이 좋아짐. (다형성)
    private PlayerLevel level; // 상위 클래스인 PlayerLevel으로 선언 : PlayerLevel을 상속하여 만드는 하위 클래스들이 들어와도 묵시적 업캐스팅이 되므로 확장성이 좋아짐.

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void play(int count){
        level.go(count);
    }





}
