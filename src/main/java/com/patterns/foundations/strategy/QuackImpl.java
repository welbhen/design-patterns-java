package com.patterns.foundations.strategy;

public class QuackImpl implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
