package org.example.week3.factory.dungeon;

import org.example.week3.factory.monster.Monster;

public abstract class Dungeon {

    public Monster spawnMonster() {
        System.out.println(getDescription());
        Monster monster = createMonster();
        System.out.println(monster.getName() + " 생성 완료");
        return monster;
    }

    protected abstract Monster createMonster();

    protected abstract String getDescription();
}
