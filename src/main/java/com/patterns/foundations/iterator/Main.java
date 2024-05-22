package com.patterns.foundations.iterator;


/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        // Creates our Cafe:
        Cafe cafe = new Cafe(new PancakeHouseMenu(), new DinerMenu());

        // Let's see our PancakeHouseMenu:
        cafe.printMenu();
    }
}