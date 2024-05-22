package com.pattern.foundations.observer.weather;

import com.pattern.foundations.observer.Observer;
import com.pattern.foundations.observer.Subject;

import java.util.ArrayList;

/**
 * Concrete implementation of the Subject class.
 * Where we are creating a Weather Station simulation class.
 */
public class WeatherStation implements Subject {
    private ArrayList<Observer> observers;

    private int temperature = 0;
    private int windSpeed = 0;
    private int pressure = 0;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, windSpeed, pressure);
        }
    }

    public void setTemperature(int value){
        this.temperature = value;
        notifyObservers();
    }

    public void setWindSpeed(int value){
        this.windSpeed = value;
        notifyObservers();
    }

    public void setPressure(int value){
        this.pressure = value;
        notifyObservers();
    }
}
