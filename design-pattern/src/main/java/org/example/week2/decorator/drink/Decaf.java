package org.example.week2.decorator.drink;

import org.example.week2.decorator.interfaces.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
