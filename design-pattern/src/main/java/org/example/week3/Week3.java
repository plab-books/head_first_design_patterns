package org.example.week3;

import org.example.week3.factory.dungeon.Dungeon;
import org.example.week3.factory.dungeon.ForestDungeon;
import org.example.week3.factory.dungeon.VolcanoDungeon;
import org.example.week3.factory.monster.Monster;
import org.example.week3.singleton.SingletonThreadTest;


public class Week3 {

    public void factoryPattern(){

        Dungeon forestDungeon = new ForestDungeon();
        Monster wolfMonster = forestDungeon.spawnMonster();
        wolfMonster.introduce();

        System.out.println();

        Dungeon volcanoDungeon = new VolcanoDungeon();
        Monster dragonMonster = volcanoDungeon.spawnMonster();
        dragonMonster.introduce();

    }

    public void singletonPattern(){

        System.out.println("=== 싱글톤 멀티 스레드 테스트 ===");
        SingletonThreadTest singletonThreadTest = new SingletonThreadTest();
        singletonThreadTest.runAll();
    }
}
