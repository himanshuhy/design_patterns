package com.designpatterns.observer;

public class AltitudeObserver implements IObserver {
    public void update(Event event) {
        System.out.println("Altitude: " + event.altitude);
    }
}
