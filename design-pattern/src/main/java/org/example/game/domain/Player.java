package org.example.game.domain;

public class Player implements Character {
    private final String name;
    private Stats hp;
    private Stats mp;
    private CombatStats combatStats;

    public Player(String name, Stats hp, Stats mp, CombatStats combatStats) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
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

    private void takeDamage(int damage) {
        this.hp = this.hp.decrease(damage);
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다. 현재 HP: " + hp.currentStatus());
    }

    @Override
    public void consumeMana(int amount) {
        this.mp = this.mp.consume(amount);
        System.out.println(name + "이(가) " + amount + "의 마나를 사용했습니다. 현재 MP: " + mp.currentStatus());
    }

    public void heal(int amount) {
        this.hp = this.hp.increase(amount);
        System.out.println(name + "이(가) " + amount + "만큼 회복했습니다. 현재 HP: " + hp.currentStatus());
    }

    @Override public boolean isDead() { return hp.isZero(); }
    @Override public String name() { return this.name; }
    @Override public Stats hp() { return this.hp; }
    @Override public CombatStats combatStats() { return this.combatStats; }
}
