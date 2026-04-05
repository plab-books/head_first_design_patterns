package org.example.week2.decorator.drink;

import org.example.week2.decorator.interfaces.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크로스트 커피";
    }

    @Override
    public double cost() {
        return .99;
    }
}
