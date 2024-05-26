package com.patterns.creational.prototype;

public abstract class Meal {
    private int price;

    public Meal(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * It's a convention to call this method Clone when using the Prototype pattern.
     * @return Meal
     */
    public abstract Meal clone();
}
