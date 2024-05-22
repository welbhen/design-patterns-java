package com.pattern.foundations.observer;


import com.pattern.foundations.observer.weather.Alert;
import com.pattern.foundations.observer.weather.UserInterface;
import com.pattern.foundations.observer.weather.WeatherStation;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        // Let's create our Weather Station Subject instance
        WeatherStation weatherStation = new WeatherStation();

        // Let's create our UserInterface Observer
        Observer userInterface = new UserInterface(weatherStation);

        // Let's create our Alert Observer
        Observer alert = new Alert(weatherStation);

        // Let's give the first values to our Weather Station:
        weatherStation.setTemperature(50);
        weatherStation.setWindSpeed(100);
        weatherStation.setPressure(75);

        // Let's update our values again:
        weatherStation.setTemperature(68);
        weatherStation.setWindSpeed(125);
        weatherStation.setPressure(89);

        // Let's unsubscribe our Observers from our Subject
        userInterface.unsubscribe();
        alert.unsubscribe();

        // Now let's see what happens if we update the Weather Station with no subscribers?
        System.out.println("No subscribers.");
        weatherStation.setTemperature(90);
        weatherStation.setWindSpeed(135);
        weatherStation.setPressure(95);
    }
}