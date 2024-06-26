package com.patterns.foundations.decorator;

/**
 * Beverage superclass
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
