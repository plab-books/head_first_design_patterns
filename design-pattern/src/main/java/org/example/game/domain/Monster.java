package org.example.game.domain;

public class Monster implements Character {
    private final String name;
    private Stats hp;
    private CombatStats combatStats;

    public Monster(String name, Stats hp, CombatStats combatStats) {
        this.name = name;
        this.hp = hp;
        this.combatStats = combatStats;
    }

    @Override
    public void takePhysicalDamage(int damage) {
        int reducedDamage = Math.max(damage - combatStats.defense(), 0);
        takeDamage(reducedDamage);
    }

    @Override
    public void takeMagicalDamage(int damage) {
        int reducedDamage = Math.max(damage - combatStats.magicResistance(), 0);
        takeDamage(reducedDamage);
    }

    public void takeDamage(int amount) {
        this.hp = this.hp.decrease(amount);
        if(hp.isZero()) System.out.println(name + "이(가) 쓰러졌습니다.");
        else System.out.println(name + "이(가) " + amount + "의 피해를 입었습니다. 현재 HP: " + hp.currentStatus());
    }

    @Override public boolean isDead() { return hp.isZero(); }
    @Override public String name() { return this.name; }
    @Override public Stats hp() { return this.hp; }
    @Override public CombatStats combatStats() { return this.combatStats; }
}