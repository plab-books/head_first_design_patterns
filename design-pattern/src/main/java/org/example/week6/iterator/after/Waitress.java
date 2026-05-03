package org.example.week6.iterator.after;

import org.example.week6.iterator.domain.MenuItem;

import java.util.Iterator;
import java.util.List;

public class Waitress {
    private final List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
