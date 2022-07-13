package com.example.algorithm.current.oop.template5.test2;

import java.util.ArrayList;

public class GameTest {

    public static void main(String[] args) {

        ArrayList<Player2> player2s = new ArrayList<>();

        Player2 bplayer2 = new Player2(new BeginnerLevel2());
        player2s.add(bplayer2);
        Player2 mplayer2 = new Player2(new MediumLevel2());
        player2s.add(mplayer2);
        Player2 aplayer2 = new Player2(new AdvancedLevel2());
        player2s.add(aplayer2);

        for (Player2 player2 : player2s) {
            player2.go();
        }

    }
}
