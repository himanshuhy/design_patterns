package com.designpatterns.abstractfactory;

public class LightComponentFactory implements IAbstractComponentFactory {
    @Override
    public AlertComponent createAlertComponent() {
        return new LightAlertComponent();
    }

    @Override
    public ButtonComponent createButtonComponent() {
        return new LightButtonComponent();
    }
}
