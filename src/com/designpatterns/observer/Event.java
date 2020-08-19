package com.designpatterns.observer;

public class Event {
    public Event (int temperature, int altitude) {
        this.temperature = temperature;
        this.altitude = altitude;
    }
    public int temperature;
    public int altitude;
}
