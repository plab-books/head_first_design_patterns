package org.example.game.domain;

public record CombatStats(
        int attackPower,
        int spellPower,
        int defense,
        int magicResistance
) {
    public CombatStats {
        if (attackPower < 0 || spellPower < 0 || defense < 0 || magicResistance < 0) {
            throw new IllegalArgumentException("전투 스탯은 0보다 작을 수 없습니다.");
        }
    }
}