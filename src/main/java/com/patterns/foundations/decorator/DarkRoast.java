package com.patterns.foundations.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast coffee";
    }

    @Override
    public double getCost() {
        return 0.99;
    }
}
