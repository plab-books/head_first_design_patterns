package org.example.week3.factory.monster;


import org.example.week3.factory.part.Armor;
import org.example.week3.factory.part.Attack;
import org.example.week3.factory.part.Skill;

public class WolfMonster extends Monster {
    public WolfMonster(Attack attack, Armor armor, Skill skill) {
        this.name = "늑대 몬스터";
        this.attack = attack;
        this.armor = armor;
        this.skill = skill;
    }
}
