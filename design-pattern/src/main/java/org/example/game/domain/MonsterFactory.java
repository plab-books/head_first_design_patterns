package org.example.game.domain;

import java.util.concurrent.ThreadLocalRandom;

public class MonsterFactory {
    public static Monster createSlime() {

        ThreadLocalRandom r = ThreadLocalRandom.current();

        int hpMax = r.nextInt(200, 400);

        int attack = r.nextInt(15, 30);
        int defense = r.nextInt(0, 20);
        int magicResistance = r.nextInt(0, 20);

        return new Monster(
                "슬라임",
                new Stats(hpMax, hpMax),
                new CombatStats(attack, 0, defense, magicResistance)
        );
    }
}
