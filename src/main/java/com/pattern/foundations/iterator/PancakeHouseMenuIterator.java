package com.pattern.foundations.iterator;

import java.util.ArrayList;

/**
 * Our DinerMenuIterator is a concrete implementation of the Iterator.
 * Its aggregate object is an Array of Strings. So we pass the T = String to our
 * Iterator class.
 */
public class PancakeHouseMenuIterator implements Iterator<String> {
    ArrayList<String> list = new ArrayList<>();
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public String next() {
        String item = list.get(position);
        position++;
        return item;
    }
}
