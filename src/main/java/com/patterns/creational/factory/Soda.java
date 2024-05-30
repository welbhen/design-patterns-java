package com.patterns.creational.factory;

public class Soda implements Snack {

    @Override
    public double getPrice() {
        return 4.29;
    }

    @Override
    public String getDescription() {
        return "Refreshing ice cold soda can.";
    }
}
