package org.example.week3.factory.partfactory;


import org.example.week3.factory.part.*;

public class ForestPartFactory implements MonsterPartFactory {

    @Override
    public Attack createAttack() {
        return new ClawAttack();
    }

    @Override
    public Armor createArmor() {
        return new LeafArmor();
    }

    @Override
    public Skill createSkill() {
        return new PoisonSkill();
    }
}
