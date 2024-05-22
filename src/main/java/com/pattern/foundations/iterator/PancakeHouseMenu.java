package com.pattern.foundations.iterator;

import java.util.ArrayList;

/**
 * Concrete implementation of our Aggregate class: Menu.
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        menuItems.add("Pancake");
        menuItems.add("Apple Pie");
        menuItems.add("Bacon");
        menuItems.add("Black coffee");
        menuItems.add("Sparkling water");
    }


    @Override
    public Iterator<String> createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    // Other classes...
}
