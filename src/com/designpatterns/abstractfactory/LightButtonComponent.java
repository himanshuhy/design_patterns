package com.designpatterns.abstractfactory;

public class LightButtonComponent implements ButtonComponent {
    @Override
    public void click() {
        System.out.println("Light themed button!");
    }
}
