package com.patterns.creational.abstractfactories;

public class BigScrollbar implements Scrollbar {

    @Override
    public String getSize() {
        return "BIG";
    }
}
