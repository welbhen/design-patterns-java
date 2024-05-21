package com.iterator.pattern;


import com.observer.pattern.Observer;
import com.observer.pattern.weather.Alert;
import com.observer.pattern.weather.UserInterface;
import com.observer.pattern.weather.WeatherStation;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        // Creates our Cafe:
        Cafe cafe = new Cafe(new PancakeHouseMenu(), new DinerMenu());

        // Let's see our PancakeHouseMenu:
        cafe.printMenu();
    }
}