package com.decorator.pattern;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        // Let's start creating our composed-beverage
        Beverage beverage = new DarkRoast();

        // Let's add our coffee additional options - or better saying: our decorators
        beverage = new Whip(beverage); // this creates our 1st decorator - notice we're composing each class within each other
        beverage = new Mocha(beverage); // 2nd decorator
        beverage = new Mocha(beverage); // 3rd decorator

        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

    }
}