package com.pattern.foundations.factory;

public abstract class PizzaStore {
    Pizza pizza;

    public Pizza orderPizza(String type) {
        pizza = createPizza(type);
        pizza.getIngredients();
        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    public abstract Pizza createPizza(String type);
}
