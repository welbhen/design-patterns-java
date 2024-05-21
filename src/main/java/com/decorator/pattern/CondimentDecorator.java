package com.decorator.pattern;

/**
 * Our Decorator class.
 * It extends our Beverage superclass
 * and override the getDescription() method with an abstract method
 * making all concrete Decorators to implement it.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
