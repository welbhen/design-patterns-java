package com.stratety.pattern;

public class SqueakImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
