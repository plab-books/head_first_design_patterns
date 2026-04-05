package org.example.week2.decorator.drink;

import org.example.week2.decorator.interfaces.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레스";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
