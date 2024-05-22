package com.patterns.foundations.iterator;

/**
 * Simulates our client Cafe restaurant.
 */
public class Cafe {
    // Let's instantiate our menus:
    Menu pancakeMenu;
    Menu dinerMenu;

    public Cafe(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = pancakeMenu;
    }

    public void printMenu() {
        Iterator<String> pancakeIterator = pancakeMenu.createIterator();
        Iterator<String> dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator<String> iterator) {
        while(iterator.hasNext()) {
            String menuItem = iterator.next();
            System.out.println(menuItem);
        }
    }
}
