package com.strategy.pattern;

/**
 * Mallard duck concrete class
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        super();
        quackBehavior = new QuackImpl();
        flyBehavior = new FlyWithWingsImpl();
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }
}
