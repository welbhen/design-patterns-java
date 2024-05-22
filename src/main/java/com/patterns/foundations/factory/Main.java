package com.patterns.foundations.factory;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        // We're in NY:
        System.out.println("Hello from NY!");
        PizzaStore ny = new NYPizzaStore();

        // We want some Meat NY Style Pizza:
        Pizza myNyPizza = ny.orderPizza("meat");
        System.out.println("I just ordered in NY a " + myNyPizza.getName() + ".");

        // Now let's travel to Chicago:
        System.out.println("Hello from Chicago!");
        PizzaStore chicago = new ChicagoPizzaStore();

        // Let's order our Chicago style Pizza:
        Pizza myChicagoPizza = chicago.orderPizza("cheese");
        System.out.println("I just ordered in Chicago a " + myChicagoPizza.getName() + ".");
    }
}