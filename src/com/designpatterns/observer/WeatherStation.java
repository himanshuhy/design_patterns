package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * If you need observable to only update the observers per the event, then we add details to the
 * Observer like, "interests"
 * or keep a Map with <Interest, Observer>
 */
public class WeatherStation implements IObservable {
    private List<IObserver> observers;
    private Event event;
    public WeatherStation(){
        this.observers = new ArrayList<>();
    }
    public void register(IObserver observer) {
        this.observers.add(observer);
    }
    public void deregister(IObserver observer) {
        this.observers.remove(observer);
    }
    public void notifyObservers() {
        this.observers.forEach(observer -> observer.update(event));
    }
    public void updateState(Event event){
        this.event = event;
        notifyObservers();
    }
}
