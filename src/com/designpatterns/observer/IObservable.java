package com.designpatterns.observer;

public interface IObservable {
    public void register(IObserver observer);
    public void deregister(IObserver observer);
    public void notifyObservers();
}
