package com.pattern.foundations.adapter;

/**
 * Main class - that will serve as our Client
 * It runs as a Duck Simulator and tests the Duck.
 */
public class Main {
    public static void main(String[] args) {
        // Real duck
        Duck duck = new DuckImpl();

        // Test our real duck
        testDuck(duck);

        // Now, let's create a Drone
        Drone drone = new DroneImpl();

        // We can't test the drone as a duck
        // testDuck(drone); // throws an exception, so we need an Adapter

        // Now we use the Adapter
        Duck droneAdapter = new DroneAdapter(drone);

        // And finally, we can test our Drone class as it were a Duck class
        testDuck(droneAdapter);
    }

    public static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}