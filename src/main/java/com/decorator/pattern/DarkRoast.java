package com.decorator.pattern;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast coffee";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
