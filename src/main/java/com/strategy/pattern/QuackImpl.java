package com.strategy.pattern;

public class QuackImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
