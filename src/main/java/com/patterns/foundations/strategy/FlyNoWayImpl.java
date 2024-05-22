package com.patterns.foundations.strategy;

public class FlyNoWayImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Stay on the ground.");
    }
}
