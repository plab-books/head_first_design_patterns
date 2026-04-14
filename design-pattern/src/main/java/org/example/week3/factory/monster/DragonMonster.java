package org.example.week3.factory.monster;


import org.example.week3.factory.part.Armor;
import org.example.week3.factory.part.Attack;
import org.example.week3.factory.part.Skill;

public class DragonMonster extends Monster {

    public DragonMonster(Attack attack, Armor armor, Skill skill) {
        this.name = "드래곤 몬스터";
        this.attack = attack;
        this.armor = armor;
        this.skill = skill;
    }
}
