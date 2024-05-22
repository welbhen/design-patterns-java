package com.pattern.foundations.factory;

public abstract class Pizza {
    public abstract void getIngredients();
    public abstract String getName();

    public void prepare() {
        System.out.println("Preparing");
    };

    public void cut() {
        System.out.println("Cutting");
    }

    public void box() {
        System.out.println("Putting on a box... done!");
    }
}
