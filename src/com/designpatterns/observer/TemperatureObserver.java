package com.designpatterns.observer;

public class TemperatureObserver implements IObserver{
    public void update(Event event){
        System.out.println("Temperature updated: " + event.temperature);
    }
}
