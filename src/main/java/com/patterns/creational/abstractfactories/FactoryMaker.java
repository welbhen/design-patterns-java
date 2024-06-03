package com.patterns.creational.abstractfactories;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    public static final Map<String, Supplier<UserInterfaceFactory>> uiFactory = new HashMap<>();

    static {
        uiFactory.put("BLUE", BlueUserInterfaceFactory::new); // if "BLUE" returns a new BlueUserInterfaceFactory from callback
        uiFactory.put("RED", RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String color) {
        if(uiFactory.get(color) != null) {
            return uiFactory.get(color).get();
        } else {
            throw new IllegalArgumentException("Color '" + color + "' not supported");
        }
    }
}
