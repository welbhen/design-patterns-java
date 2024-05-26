package com.patterns.creational.prototype;

public class Pizza extends Meal {
    private PizzaFlavor flavor;

    public Pizza(int price, PizzaFlavor flavor) {
        super(price);
        this.flavor = flavor;
    }

    public PizzaFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(PizzaFlavor flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "--- Pizza ---" + "\n" +
                "Price: $" + super.getPrice() + "\n" +
                "Flavor: " + flavor + "\n" +
                "-------------";
    }

    /**
     * Creates a shallow copy of a Pizza object.
     *      meaning that: when you change 1 object (e.g., using setFlavor)
     *                    it changes all the other ones as well.
     * @return Pizza
     */
    public Pizza shallowClone() {
        return new Pizza(this.getPrice(), this.getFlavor());
    }

    /**
     * Creates a deep copy of a Pizza object.
     * @return Pizza
     */
    @Override
    public Pizza clone() {
        return new Pizza(this.getPrice(), new PizzaFlavor(this.getFlavor().getName()));
    }
}
