package org.example.week3.factory.dungeon;


import org.example.week3.factory.monster.DragonMonster;
import org.example.week3.factory.monster.Monster;
import org.example.week3.factory.partfactory.MonsterPartFactory;
import org.example.week3.factory.partfactory.VolcanoPartFactory;

public class VolcanoDungeon extends Dungeon {

    @Override
    protected Monster createMonster() {
        MonsterPartFactory partFactory = new VolcanoPartFactory();

        return new DragonMonster(
                partFactory.createAttack(),
                partFactory.createArmor(),
                partFactory.createSkill()
        );
    }

    @Override
    protected String getDescription() {
        return "화산 던전: 뜨거운 용암과 화염 몬스터가 등장하는 던전입니다.";
    }
}
