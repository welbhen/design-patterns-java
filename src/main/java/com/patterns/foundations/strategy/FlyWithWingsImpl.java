package com.patterns.foundations.strategy;

public class FlyWithWingsImpl implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Beating wings.");
    }
}
