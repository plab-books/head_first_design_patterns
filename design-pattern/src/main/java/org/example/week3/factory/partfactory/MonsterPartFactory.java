package org.example.week3.factory.partfactory;


import org.example.week3.factory.part.Armor;
import org.example.week3.factory.part.Attack;
import org.example.week3.factory.part.Skill;

public interface MonsterPartFactory {

    Attack createAttack();
    Armor createArmor();
    Skill createSkill();
}
