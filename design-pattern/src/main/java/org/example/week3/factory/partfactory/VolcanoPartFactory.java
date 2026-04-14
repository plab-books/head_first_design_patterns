package org.example.week3.factory.partfactory;


import org.example.week3.factory.part.*;

public class VolcanoPartFactory implements MonsterPartFactory {
    @Override
    public Attack createAttack() {
        return new FireBreath();
    }

    @Override
    public Armor createArmor() {
        return new ScaleArmor();
    }

    @Override
    public Skill createSkill() {
        return new FlameSkill();
    }
}
