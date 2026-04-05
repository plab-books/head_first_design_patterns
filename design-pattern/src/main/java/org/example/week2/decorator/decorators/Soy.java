package org.example.week2.decorator.decorators;

import org.example.week2.decorator.interfaces.Beverage;
import org.example.week2.decorator.interfaces.CondimentDecorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
