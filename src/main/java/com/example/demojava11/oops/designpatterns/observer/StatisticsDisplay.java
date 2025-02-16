package com.example.demojava11.oops.designpatterns.observer;

public class StatisticsDisplay implements Observer,DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("StatisticsDisplay:: Temp: "+temp+"---Humidity"+humidity+"-----Pressure"+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
