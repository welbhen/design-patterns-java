package com.decorator.pattern;

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
