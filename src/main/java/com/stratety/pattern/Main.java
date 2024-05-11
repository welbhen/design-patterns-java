package com.stratety.pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
    }
}