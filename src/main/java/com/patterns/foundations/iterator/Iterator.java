package com.patterns.foundations.iterator;

/**
 * Our Iterator interface.
 * @param <T> Item type
 */
public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
