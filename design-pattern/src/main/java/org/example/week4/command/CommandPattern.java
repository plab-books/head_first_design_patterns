package org.example.week4.command;

import org.example.week4.command.domain.Character;
import org.example.week4.command.domain.MonsterFactory;
import org.example.week4.command.domain.PlayerFactory;
import org.example.week4.command.attack.*;

import java.util.Random;

public class CommandPattern {
    private static final Random random = new Random();

    public void play() {
        Character player = PlayerFactory.create("박박기기현현");
        Character monster = MonsterFactory.createSlime();
        int turn = 1;
        System.out.println("=== 전투 시작 ===");
        printStatus(player, monster);
        while (!player.isDead() && !monster.isDead()) {
            System.out.println();
            System.out.println("=== 턴 " + turn + " ===");

            // 플레이어 턴
            AttackCommand playerCommand = createPlayerRandomAttack(player, monster);
            try {
                playerCommand.execute();
            } catch (IllegalStateException e) {
                new BasicAttack(player, monster).execute();
            }
            printStatus(player, monster);

            if (monster.isDead()) {
                break;
            }

            // 몬스터 턴
            AttackCommand monsterCommand = new BasicAttack(monster, player);
            monsterCommand.execute();
            printStatus(player, monster);

            turn++;
        }

        System.out.println();
        System.out.println("=== 전투 종료 ===");

        if (player.isDead()) System.out.println(player.name() + " 패배\n");
        else System.out.println(player.name() + " 승리\n");
    }

    private static AttackCommand createPlayerRandomAttack(Character player, Character monster) {
        int pick = random.nextInt(4);

        return switch (pick) {
            case 0 -> new BasicAttack(player, monster);
            case 1 -> new Slash(player, monster);
            case 2 -> new Fireball(player, monster);
            case 3 -> new Thunderbolt(player, monster);
            default -> throw new IllegalStateException("잘못된 랜덤 값");
        };
    }

    private static void printStatus(Character player, Character monster) {
        System.out.println(player.name() + " HP: " + player.hp().currentStatus());
        System.out.println(monster.name() + " HP: " + monster.hp().currentStatus());
    }
}
