package org.example.week6.iterator;

import org.example.week6.iterator.after.CafeMenu;
import org.example.week6.iterator.after.DinerMenu;
import org.example.week6.iterator.after.Menu;
import org.example.week6.iterator.after.PancakeHouseMenu;
import org.example.week6.iterator.after.Waitress;

import java.util.List;

public class IteratorPattern {
    public void play() {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinerMenu, cafeMenu));
        waitress.printMenu();

        System.out.println("""
                [개선점]
                - 각 메뉴는 자신의 자료구조(ArrayList / 배열 / HashMap)에 맞는 Iterator 를 직접 만든다.
                - Waitress 는 Iterator 인터페이스(hasNext / next)만 알면 모든 메뉴를 동일하게 순회한다.
                - 새 메뉴가 추가돼도 Menu 인터페이스만 구현하면 Waitress 코드는 바뀌지 않는다 (OCP).
                """);
    }
}
