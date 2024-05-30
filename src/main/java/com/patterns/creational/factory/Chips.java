package com.patterns.creational.factory;

public class Chips implements Snack {

    @Override
    public double getPrice() {
        return 5.99;
    }

    @Override
    public String getDescription() {
        return "Salty and sour potato chips.";
    }
}
