package org.example.week2.decorator.interfaces;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();
}
