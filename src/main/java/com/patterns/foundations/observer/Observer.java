package com.patterns.foundations.observer;

public interface Observer {
    public void update(int temperature, int windSpeed, int pressure);
    public void unsubscribe();
}
