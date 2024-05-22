package com.pattern.foundations.factory;

public class NYStyleCheesePizza extends Pizza {

    @Override
    public void getIngredients() {
        System.out.println("Cheese pizza...");
    }

    @Override
    public String getName() {
        return "NY Style Cheese Pizza";
    }
}
