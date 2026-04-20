package org.example.week4.command;

import org.example.week4.command.domain.Character;
import org.example.week4.command.domain.MonsterFactory;
import org.example.week4.command.domain.PlayerFactory;

import java.util.Random;

public class WithoutCommandPattern {
    private static final Random random = new Random();

    // 공격 타입을 문자열로 관리
    private static final String BASIC_ATTACK = "BASIC_ATTACK";
    private static final String SLASH = "SLASH";
    private static final String FIREBALL = "FIREBALL";
    private static final String THUNDERBOLT = "THUNDERBOLT";

    public void play() {
        Character player = PlayerFactory.create("박박기기현현");
        Character monster = MonsterFactory.createSlime();
        int turn = 1;
        System.out.println("=== 전투 시작 ===");
        printStatus(player, monster);

        while (!player.isDead() && !monster.isDead()) {
            System.out.println();
            System.out.println("=== 턴 " + turn + " ===");

            // 플레이어 턴 - 커맨드 패턴 없이 직접 switch로 처리
            String playerAttackType = pickRandomAttack();
            executeAttack(player, monster, playerAttackType);
            printStatus(player, monster);

            if (monster.isDead()) {
                break;
            }

            // 몬스터 턴 - 항상 기본 공격
            executeAttack(monster, player, BASIC_ATTACK);
            printStatus(player, monster);

            turn++;
        }

        System.out.println();
        System.out.println("=== 전투 종료 ===");
        if (player.isDead()) System.out.println(player.name() + " 패배\n");
        else System.out.println(player.name() + " 승리\n");
    }

    // 공격 로직이 이 메서드 하나에 전부 몰려있다 → 새 공격 추가 시 여기를 수정해야 함
    private void executeAttack(Character attacker, Character target, String attackType) {
        switch (attackType) {
            case BASIC_ATTACK -> {
                int damage = attacker.combatStats().attackPower();
                target.takePhysicalDamage(damage);
                System.out.println(attacker.name() + "가 " + target.name() + "을 공격했습니다.");
            }
            case SLASH -> {
                try {
                    attacker.consumeMana(5);
                    int damage = attacker.combatStats().attackPower() + 10;
                    target.takePhysicalDamage(damage);
                    System.out.println("슬래시!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println(attacker.name() + "가 " + target.name() + "을 공격했습니다.");
                } catch (IllegalStateException e) {
                    // 마나 부족 시 기본 공격으로 fallback
                    executeAttack(attacker, target, BASIC_ATTACK);
                }
            }
            case FIREBALL -> {
                try {
                    attacker.consumeMana(20);
                    int damage = attacker.combatStats().attackPower() + 20;
                    target.takeMagicalDamage(damage);
                    System.out.println("파이어볼!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println(attacker.name() + "가 " + target.name() + "을 공격했습니다.");
                } catch (IllegalStateException e) {
                    executeAttack(attacker, target, BASIC_ATTACK);
                }
            }
            case THUNDERBOLT -> {
                try {
                    attacker.consumeMana(20);
                    int damage = attacker.combatStats().attackPower() + 15;
                    target.takeMagicalDamage(damage);
                    System.out.println("썬더볼트!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println(attacker.name() + "가 " + target.name() + "을 공격했습니다.");
                } catch (IllegalStateException e) {
                    executeAttack(attacker, target, BASIC_ATTACK);
                }
            }
            default -> throw new IllegalStateException("알 수 없는 공격 타입: " + attackType);
        }
    }

    private static String pickRandomAttack() {
        return switch (random.nextInt(4)) {
            case 0 -> BASIC_ATTACK;
            case 1 -> SLASH;
            case 2 -> FIREBALL;
            case 3 -> THUNDERBOLT;
            default -> throw new IllegalStateException("잘못된 랜덤 값");
        };
    }

    private static void printStatus(Character player, Character monster) {
        System.out.println(player.name() + " HP: " + player.hp().currentStatus());
        System.out.println(monster.name() + " HP: " + monster.hp().currentStatus());
    }
}
