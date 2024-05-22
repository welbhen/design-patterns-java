package com.patterns.foundations.iterator;

/**
 * Our DinerMenuIterator is a concrete implementation of the Iterator.
 * Its aggregate object is an Array of Strings. So we pass the T = String to our
 * Iterator class.
 */
public class DinerMenuIterator implements Iterator<String> {
    String[] list;
    int position = 0;

    public DinerMenuIterator(String[] list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.length;
    }

    @Override
    public String next() {
        String item = list[position];
        position++;
        return item;
    }
}
