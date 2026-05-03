package org.example.week6.iterator;

import org.example.week6.iterator.before.DinerMenu;
import org.example.week6.iterator.before.PancakeHouseMenu;
import org.example.week6.iterator.before.Waitress;

public class WithoutIteratorPattern {
    public void play() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();

        System.out.println("""

                [문제점]
                - PancakeHouseMenu 는 ArrayList, DinerMenu 는 배열로 메뉴를 관리한다.
                - Waitress 가 두 자료구조의 내부 구현을 모두 알아야 한다.
                - 새 메뉴(예: HashMap 기반 카페 메뉴)가 추가될 때마다 Waitress 의 코드가 바뀐다.
                """);
    }
}
