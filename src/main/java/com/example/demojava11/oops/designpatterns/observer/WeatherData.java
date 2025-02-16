package com.example.demojava11.oops.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer ob = (Observer) observers.get(i);
            ob.update(temp,humidity,pressure);
        }
    }


    public void measurementsChanged(){
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
