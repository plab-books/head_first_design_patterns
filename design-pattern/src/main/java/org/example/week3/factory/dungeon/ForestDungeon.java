package org.example.week3.factory.dungeon;

import org.example.week3.factory.monster.Monster;
import org.example.week3.factory.monster.WolfMonster;
import org.example.week3.factory.partfactory.ForestPartFactory;
import org.example.week3.factory.partfactory.MonsterPartFactory;

public class ForestDungeon extends Dungeon {
    @Override
    protected Monster createMonster() {
        MonsterPartFactory partFactory = new ForestPartFactory();

        return new WolfMonster(
                partFactory.createAttack(),
                partFactory.createArmor(),
                partFactory.createSkill()
        );
    }

    @Override
    protected String getDescription() {
        return "숲 던전: 나무와 독 기운이 가득한 던전입니다.";
    }
}
