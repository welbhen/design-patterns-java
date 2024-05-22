package com.pattern.foundations.strategy;

public class SqueakImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
