package com.designpatterns.abstractfactory;

public class DarkButtonComponent implements ButtonComponent {
    @Override
    public void click() {
        System.out.println("Dark button");
    }
}
