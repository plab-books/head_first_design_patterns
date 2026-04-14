package org.example.week3.factory.monster;


import org.example.week3.factory.part.Armor;
import org.example.week3.factory.part.Attack;
import org.example.week3.factory.part.Skill;

public abstract class Monster {

    protected String name;
    protected Attack attack;
    protected Armor armor;
    protected Skill skill;

    public void introduce() {
        System.out.println("몬스터 이름: " + name);
        System.out.println("공격 방식: " + attack.getDescription());
        System.out.println("방어구: " + armor.getDescription());
        System.out.println("스킬: " + skill.getDescription());
    }

    public String getName() {
        return name;
    }
}
