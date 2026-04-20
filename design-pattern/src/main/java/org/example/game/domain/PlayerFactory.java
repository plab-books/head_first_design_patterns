package org.example.game.domain;

import java.util.concurrent.ThreadLocalRandom;

public class PlayerFactory {
    public static Player create(String name) {
        ThreadLocalRandom r = ThreadLocalRandom.current();
        int maxHp = r.nextInt(50, 200);
        int maxMp = r.nextInt(50, 100);
        int attackPower = r.nextInt(10, 50);
        int spellPower = r.nextInt(10, 50);
        int defense = r.nextInt(5, 30);
        int magicResistance = r.nextInt(5, 30);
        return new Player(
                name,
                new Stats(maxHp, maxHp),
                new Stats(maxMp, maxMp),
                new CombatStats(attackPower, spellPower, defense, magicResistance)
        );
    }
}
