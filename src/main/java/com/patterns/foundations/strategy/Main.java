package com.patterns.foundations.strategy;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();

        // Display
        System.out.println("How does my duck look like?");
        mallard.display();
        rubber.display();

        // Swim
        System.out.println("Swim my little ducks:");
        mallard.swim();
        rubber.swim();

        // Quack
        System.out.println("Ducks are gonna quack:");
        mallard.performQuack();
        rubber.performQuack();

        // Fly
        System.out.println("Ducks are gonna try to fly:");
        mallard.performFly();
        rubber.performFly();

        // Change on runtime the Fly behavior of one subclass of Duck
        System.out.println("Something happened with our Mallard and it can't fly anymore:");
        mallard.setFlyBehavior(new FlyNoWayImpl());
        mallard.performFly();
    }
}