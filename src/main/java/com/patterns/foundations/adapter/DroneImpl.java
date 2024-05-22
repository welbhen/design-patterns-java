package com.patterns.foundations.adapter;

public class DroneImpl implements Drone {

    @Override
    public void beep() {
        System.out.println("Beep beep beep!");
    }

    @Override
    public void spinRotors() {
        System.out.println("Spinning rotors...");
    }

    @Override
    public void takeOff() {
        System.out.println("1, 2, 3... Go!");
    }
}
