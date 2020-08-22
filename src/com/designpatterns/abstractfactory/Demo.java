package com.designpatterns.abstractfactory;

public class Demo {
    public static void main(String[] args) {
        IAbstractComponentFactory lightFactory = new LightComponentFactory();
        IAbstractComponentFactory darkFactory = new DarkComponentFactory();
        lightFactory.createAlertComponent().alert();
        lightFactory.createButtonComponent().click();
        darkFactory.createButtonComponent().click();
        darkFactory.createAlertComponent().alert();
    }
}
