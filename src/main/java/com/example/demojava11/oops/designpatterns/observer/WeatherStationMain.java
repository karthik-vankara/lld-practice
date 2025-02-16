package com.example.demojava11.oops.designpatterns.observer;

public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);


//        weatherData.setMeasurements(10,20,30);
//        weatherData.setMeasurements(100,200,300);
        for (int i = 1; i < 5; i++) {
            weatherData.setMeasurements(i*10,i*20,i*30);
        }
    }
}
