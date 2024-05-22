package com.patterns.creational.builder;

/**
 * Builder Class for StoreItem concrete Class.
 */
public class StoreItemBuilder {
    // We're going to separate the required fields (final) from the non-required ones.
    // required:
    public final String name;
    public final Double price;
    public final Integer stockQuantity;
    // non-required:
    public String shortDescription;
    public String longDescription;
    public String packagingType;

    public StoreItemBuilder(String name, Double price, Integer stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public StoreItemBuilder shortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public StoreItemBuilder longDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public StoreItemBuilder packagingType(String packagingType) {
        this.packagingType = packagingType;
        return this;
    }

    public StoreItem build() {
        return new StoreItem(this);
    }
}
