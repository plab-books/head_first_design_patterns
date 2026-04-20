package org.example.week4.command.attack;

import org.example.week4.command.domain.Character;

public class BasicAttack implements AttackCommand {
    private final Character attacker;
    private final Character target;

    public BasicAttack(Character attacker, Character target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        int damage = attacker.combatStats().attackPower();
        target.takePhysicalDamage(damage);
        System.out.println(attacker.name()+ "가 " + target.name() + "을 공격했습니다.");
    }
}
