package com.patterns.creational.factory;

/**
 * Main class.
 */
public class Main {

    public static final VendingMachine VENDING_MACHINE = new VendingMachine();

    public static void main(String[] args) {
        // Let's buy some snacks:
        System.out.println("--- Chocolate ---");
        buySnack("chocolate");
        System.out.println("--- Chips ---");
        buySnack("chips");
        System.out.println("--- Soda ---");
        buySnack("soda");
        System.out.println("--- Candy ---");
        buySnack("candy");
    }

    private static void buySnack(String type) {
        Snack snack = VENDING_MACHINE.getSnack(type);
        System.out.println(type.toUpperCase() + " $" + snack.getPrice() + ": " + snack.getDescription());
    }
}
