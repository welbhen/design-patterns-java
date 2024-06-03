package com.patterns.creational.abstractfactories;

public class RedUserInterfaceFactory implements UserInterfaceFactory {

    @Override
    public Button createButton() {
        return new RedButton();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new SmallScrollbar();
    }
}
