package com.patterns.creational.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Let's create our Flavors:
        PizzaFlavor hawaiian = new PizzaFlavor("Hawaiian");
        PizzaFlavor meat = new PizzaFlavor("Meat");

        // Let's create our Hawaiian Pizzas...
        Pizza hawaiiPizza1 = new Pizza(4, hawaiian);
        Pizza hawaiiPizza2 = hawaiiPizza1.clone();
        Pizza hawaiiPizza3 = hawaiiPizza1.clone();
        Pizza hawaiiPizza4 = hawaiiPizza1.clone();
        Pizza hawaiiPizza5 = hawaiiPizza1.clone();
        Pizza hawaiiPizza6 = hawaiiPizza1.clone();

        // Let's change flavor from the first Pizza (original one):
        hawaiian.setName("Pineapple with cheese"); // only hawaiiPizza1 uses it (the other ones that are clones create a new PizzaFlavor instance internally)

        // Let's create our Meat Pizzas...
        Pizza meatPizza1 = new Pizza(8, meat);
        Pizza meatPizza2 = meatPizza1.clone();
        Pizza meatPizza3 = meatPizza1.clone();
        Pizza meatPizza4 = meatPizza1.clone();
        Pizza meatPizza5 = meatPizza1.clone();
        Pizza meatPizza6 = meatPizza1.clone();

        List<Meal> bigPizzaOrder = List.of(hawaiiPizza1, hawaiiPizza2, hawaiiPizza3, hawaiiPizza4, hawaiiPizza5, hawaiiPizza6,
                meatPizza1, meatPizza2, meatPizza3, meatPizza4, meatPizza5, meatPizza6);

        placeOrder(bigPizzaOrder);
    }
    
    public static void placeOrder(List<Meal> order) {
        for(Meal meal : order) {
            System.out.println(meal.toString());
        }
    }
}
