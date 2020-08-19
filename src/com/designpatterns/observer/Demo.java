package com.designpatterns.observer;

public class Demo {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        TemperatureObserver temperatureObserver = new TemperatureObserver();
        AltitudeObserver altitudeObserver = new AltitudeObserver();
        weatherStation.register(temperatureObserver);
        weatherStation.register(altitudeObserver);
        weatherStation.updateState(new Event(100, 5000));
        weatherStation.updateState(new Event(80, 6600));
    }
}
