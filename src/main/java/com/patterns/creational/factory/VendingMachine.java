package com.patterns.creational.factory;

public class VendingMachine {

    public Snack getSnack(String type) {
        return switch (type) {
            case "chocolate" -> new ChocolateBar();
            case "soda" -> new Soda();
            case "chips" -> new Chips();
            default -> throw new RuntimeException("Snack not available");
        };
    }
}
