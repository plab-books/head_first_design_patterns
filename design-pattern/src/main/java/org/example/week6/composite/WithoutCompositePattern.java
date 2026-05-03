package org.example.week6.composite;

import java.util.ArrayList;
import java.util.List;

public class WithoutCompositePattern {

    static class MenuItem {
        final String name;
        final String description;
        final double price;

        MenuItem(String name, String description, double price) {
            this.name = name;
            this.description = description;
            this.price = price;
        }
    }

    static class Menu {
        final String name;
        final List<MenuItem> items = new ArrayList<>();
        final List<Menu> subMenus = new ArrayList<>();

        Menu(String name) {
            this.name = name;
        }
    }

    public void play() {
        Menu dinerMenu = new Menu("객체마을 식당 메뉴");
        dinerMenu.items.add(new MenuItem("BLT", "통밀빵 BLT", 2.99));
        dinerMenu.items.add(new MenuItem("핫도그", "사워크라우트 핫도그", 3.05));

        Menu dessertMenu = new Menu("디저트 메뉴");
        dessertMenu.items.add(new MenuItem("애플 파이", "바삭한 크러스트의 애플 파이", 1.59));
        dessertMenu.items.add(new MenuItem("치즈케이크", "진한 치즈케이크", 1.99));

        dinerMenu.subMenus.add(dessertMenu);

        printMenu(dinerMenu);

        System.out.println("""

                [문제점]
                - MenuItem 과 Menu 는 다른 타입이라 한 컬렉션에 같이 못 담는다.
                  → items, subMenus 두 컬렉션으로 쪼개진다.
                - Waitress(printMenu) 가 두 컬렉션을 모두 알고 각각 따로 처리해야 한다.
                - 서브메뉴 안에 또 서브메뉴가 들어가면 재귀 호출도 클라이언트가 직접 짜야 한다.
                - 메뉴 트리 구조가 깊어질수록 클라이언트 코드가 복잡해진다.
                """);
    }

    private void printMenu(Menu menu) {
        System.out.println();
        System.out.println(menu.name);
        System.out.println("---------------------");
        for (MenuItem item : menu.items) {
            System.out.printf("  %s, $%.2f -- %s%n", item.name, item.price, item.description);
        }
        for (Menu sub : menu.subMenus) {
            printMenu(sub);
        }
    }
}
