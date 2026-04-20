package org.example.week4.command.attack;

import org.example.game.domain.Character;

public class Thunderbolt implements AttackCommand {
    private final Character attacker;
    private final Character target;
    private final int cost = 20; // Thunderbolt는 20의 마나를 소모합니다.

    public Thunderbolt(Character attacker, Character target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        attacker.consumeMana(cost);
        int damage = attacker.combatStats().attackPower() + 15; // Thunderbolt는 기본 공격보다 15의 추가 피해를 줍니다.
        target.takeMagicalDamage(damage);
        System.out.println("썬더볼트!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(attacker.name() + "가 " + target.name() + "을 공격했습니다.");
    }
}
