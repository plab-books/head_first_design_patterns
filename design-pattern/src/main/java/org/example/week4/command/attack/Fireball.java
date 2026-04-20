package org.example.week4.command.attack;

import org.example.week4.command.domain.Character;

public class Fireball implements AttackCommand {
    private final Character attacker;
    private final Character target;
    private final int cost = 20; // Fireball은 20의 마나를 소모합니다.

    public Fireball(Character attacker, Character target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        attacker.consumeMana(cost);
        int damage = attacker.combatStats().attackPower() + 20; // Fireball은 기본 공격보다 20의 추가 피해를 줍니다.
        target.takeMagicalDamage(damage);
        System.out.println("파이어볼!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(attacker.name() + "가 " + target.name() + "을 공격했습니다.");
    }
}