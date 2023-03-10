package org.example.lecture1.game.inheritance;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        int magicianCount = new Random().nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicianCount: %d, priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount];
        Magician[] magicians = new Magician[magicianCount];

        for (int i = 0; i < priestCount; i++) {
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }

        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }
    }
}
