package com.pattern.foundations.strategy;

public class FlyWithWingsImpl implements FlyBehavior {

    @Override
    public void fly(){
        System.out.println("Beating wings.");
    }
}
