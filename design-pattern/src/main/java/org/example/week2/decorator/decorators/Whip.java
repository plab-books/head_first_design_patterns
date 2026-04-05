package org.example.week2.decorator.decorators;

import org.example.week2.decorator.interfaces.Beverage;
import org.example.week2.decorator.interfaces.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
