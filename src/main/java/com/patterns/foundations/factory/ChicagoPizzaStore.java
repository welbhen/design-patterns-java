package com.patterns.foundations.factory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStylePizza();
            default -> throw new RuntimeException("Wrong pizza type, in Chicago you can only go with one");
        };
    }
}

