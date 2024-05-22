package com.patterns.foundations.strategy;

public class SqueakImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
