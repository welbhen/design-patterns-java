package com.strategy.pattern;

/**
 * Duck superclass
 */
public abstract class Duck {
    FlyBehavior flyBehavior; // Interface type so it can be any of the implementations of this Interface
    QuackBehavior quackBehavior;

    public Duck(){}

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Swimming...");
    }

    public abstract void display();
}
