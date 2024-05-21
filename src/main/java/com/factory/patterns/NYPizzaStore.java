package com.factory.patterns;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "meat" -> new NYStyleMeatPizza();
            default -> throw new RuntimeException("Wrong pizza type");
        };

    }
}
