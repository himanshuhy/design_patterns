package com.designpatterns.abstractfactory;

public class LightAlertComponent implements AlertComponent {
    @Override
    public void alert() {
        System.out.println("Light themed alert window!");
    }
}
