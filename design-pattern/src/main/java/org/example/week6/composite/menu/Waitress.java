package org.example.week6.composite.menu;

public class Waitress {
    private final MenuComponent topMenu;

    public Waitress(MenuComponent topMenu) {
        this.topMenu = topMenu;
    }

    public void printMenu() {
        topMenu.print();
    }
}
