package com.designpatterns.abstractfactory;

public class DarkThemedAlertWindow implements AlertComponent {
    @Override
    public void alert() {
        System.out.println("Alert window of dark theme!");
    }
}
