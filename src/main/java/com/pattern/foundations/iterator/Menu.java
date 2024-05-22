package com.pattern.foundations.iterator;

/**
 * Aggregate interface
 */
public interface Menu {
    // We could create a class to MenuItem instead of setting it to String
    public Iterator<String> createIterator();
}
