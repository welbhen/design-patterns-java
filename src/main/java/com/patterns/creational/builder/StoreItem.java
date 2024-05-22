package com.patterns.creational.builder;

/**
 * Our concrete Class.
 */
public class StoreItem {
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockQuantity;
    private final String packagingType;

    // We're making the constructor of our Object private, so it is not wrongly used.
    // Only our Builder will use it.
    protected StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.name;
        this.price = storeItemBuilder.price;
        this.shortDescription = storeItemBuilder.shortDescription;
        this.longDescription = storeItemBuilder.longDescription;
        this.stockQuantity = storeItemBuilder.stockQuantity;
        this.packagingType = storeItemBuilder.packagingType;

        if(name == null || price == null || stockQuantity == null ) {
            throw new IllegalArgumentException("Name, price and quantity are required!");
        }
    }

    @Override
    public String toString() {
        return "(New Store Item)\n" +
                name + " - $" + price + "\n" +
                "Description: " + shortDescription + "\n" +
                "Details: " + longDescription + "\n" +
                stockQuantity +" item(s) available in stock" + "\n" +
                "Should be packed as follows: " + packagingType + "\n" +
                "---------------------------------------------------";
    }
}
