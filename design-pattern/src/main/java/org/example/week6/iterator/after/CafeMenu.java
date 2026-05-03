package org.example.week6.iterator.after;

import org.example.week6.iterator.domain.MenuItem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    private final Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("베지 버거와 에어프라이", "통밀빵, 상추, 토마토, 감자 튀김이 곁들여진 베지 버거", true, 3.99);
        addItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69);
        addItem("부리토", "강낭콩, 살사, 구아카몰레가 곁들여진 푸짐한 부리토", true, 4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
