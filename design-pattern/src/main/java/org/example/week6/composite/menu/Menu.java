package org.example.week6.composite.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private final List<MenuComponent> children = new ArrayList<>();
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void add(MenuComponent component) {
        children.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        children.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return children.get(i);
    }

    @Override
    public void print() {
        System.out.println();
        System.out.printf("%s, %s%n", name, description);
        System.out.println("---------------------");
        for (MenuComponent child : children) {
            child.print();
        }
    }
}
