package com.patterns.creational.builder;

/**
 * Main Class.
 */
public class Store {

    public static void main(String[] args) {
        System.out.println("### Starting our Store! ###");

        // Creates items:
        StoreItem firstItem = new StoreItemBuilder("Chair", 25.99, 8)
                .shortDescription("This is a beautiful antique wooden chair.")
                .packagingType("Medium cardboard box")
                .build();

        StoreItem secondItem = new StoreItemBuilder("Dinner Table", 58.49, 4)
                .shortDescription("This is a glass dinner table from France.")
                .longDescription("Bla bla bla")
                .packagingType("Big cardboard box")
                .build();

        // Print item information:
            printItem(firstItem);
            printItem(secondItem);
    }

    private static void printItem(StoreItem item) {
        System.out.println("---- New Item in order ----\n" + item.toString());
    }
}
