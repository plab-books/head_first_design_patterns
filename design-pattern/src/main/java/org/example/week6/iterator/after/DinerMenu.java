package org.example.week6.iterator.after;

import org.example.week6.iterator.domain.MenuItem;

import java.util.Iterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];
    private int numberOfItems = 0;

    public DinerMenu() {
        addItem("채식주의자용 BLT", "통밀빵에 콩고기 베이컨과 양상추, 토마토를 곁들인 메뉴", true, 2.99);
        addItem("BLT", "통밀빵에 베이컨과 양상추, 토마토를 곁들인 메뉴", false, 2.99);
        addItem("오늘의 스프", "감자 샐러드를 겉들인 오늘의 스프", false, 3.29);
        addItem("핫도그", "사워크라우트, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
            return;
        }
        menuItems[numberOfItems++] = new MenuItem(name, description, vegetarian, price);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
