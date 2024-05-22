package com.patterns.foundations.strategy;

/**
 * Rubber duck concrete class
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        super();
        quackBehavior = new SqueakImpl();
        flyBehavior = new FlyNoWayImpl();
    }

    @Override
    public void display() {
        System.out.println("I'm yellow and made of rubber.");
    }
}
