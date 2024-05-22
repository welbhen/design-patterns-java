package com.pattern.foundations.observer.weather;

import com.pattern.foundations.observer.Observer;
import com.pattern.foundations.observer.Subject;

public class Alert implements Observer {
    private int temperature;
    private int windSpeed;
    private int pressure;

    private Subject weatherStation; // Each Observer needs a reference to the Subject it is subscribing to, so it can register itself

    public Alert(Subject subject) {
        this.weatherStation = subject;
        subject.registerObserver(this);
    }

    @Override
    public void unsubscribe() {
        weatherStation.removeObserver(this);
    }

    @Override
    public void update(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("### ALERT!!!! ###");
        System.out.println("Temperature: " + temperature);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Pressure: " + pressure);
    }
}
