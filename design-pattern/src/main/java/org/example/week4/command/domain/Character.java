package org.example.week4.command.domain;

public interface Character {
    String name();
    Stats hp();
    CombatStats combatStats();
    void takePhysicalDamage(int damage);
    void takeMagicalDamage(int damage);
    boolean isDead();
    default void consumeMana(int amount) {
        throw new UnsupportedOperationException("마나를 사용할 수 없습니다.");
    }
}