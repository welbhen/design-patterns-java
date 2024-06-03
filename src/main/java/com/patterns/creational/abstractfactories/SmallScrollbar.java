package com.patterns.creational.abstractfactories;

public class SmallScrollbar implements Scrollbar {

    @Override
    public String getSize() {
        return "SMALL";
    }
}
