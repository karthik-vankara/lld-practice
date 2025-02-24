package com.example.demojava11.oops.designpatterns.observer.inbuilt;

import com.example.demojava11.oops.designpatterns.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;

    private float temp;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay:: Temp: " + temp + "---Humidity" + humidity + "-----Pressure" + pressure);

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
