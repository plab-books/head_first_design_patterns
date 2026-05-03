package org.example.week6.iterator.before;

import org.example.week6.iterator.domain.MenuItem;

import java.util.List;

public class Waitress {
    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        List<MenuItem> pancakeItems = pancakeHouseMenu.getMenuItems();
        System.out.println("=== 아침 메뉴 ===");
        for (int i = 0; i < pancakeItems.size(); i++) {
            MenuItem item = pancakeItems.get(i);
            System.out.println(item);
        }

        MenuItem[] dinerItems = dinerMenu.getMenuItems();
        System.out.println("\n=== 점심 메뉴 ===");
        for (int i = 0; i < dinerMenu.getNumberOfItems(); i++) {
            MenuItem item = dinerItems[i];
            System.out.println(item);
        }
    }
}
