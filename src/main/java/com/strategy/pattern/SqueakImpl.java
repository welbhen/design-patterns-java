package com.strategy.pattern;

public class SqueakImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
