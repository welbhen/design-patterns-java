package com.patterns.creational.factory;

public class ChocolateBar implements Snack {

    @Override
    public double getPrice() {
        return 3.99;
    }

    @Override
    public String getDescription() {
        return "Delicious chocolate bar.";
    }
}
