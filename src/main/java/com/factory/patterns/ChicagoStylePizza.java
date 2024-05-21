package com.factory.patterns;

public class ChicagoStylePizza extends Pizza {

    @Override
    public void getIngredients() {
        System.out.println("Adding melted cheese on top of the sauce...");
    }

    @Override
    public String getName() {
        return "Chicago Style Cheese Pizza";
    }
}
