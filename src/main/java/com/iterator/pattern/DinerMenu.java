package com.iterator.pattern;

/**
 * Concrete implementation of our Aggregate class: Menu.
 */
public class DinerMenu implements Menu {
    String[] menuItems;

    public DinerMenu() {
        menuItems = new String[]{"Pudding", "Pie", "Sandwich", "Soda", "Orange Juice"};
    }

    @Override
    public Iterator<String> createIterator() {
        return new DinerMenuIterator(menuItems);
    }

    // Other classes...
}
