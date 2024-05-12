package com.adapter.pattern;

/**
 * This is the Adapter class
 * It implements our target Interface - which is our Duck
 * And it translates/adapts the methods to the Adaptee - which is our Drone
 */
public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }

    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spinRotors();
        drone.takeOff();
    }
}
