package com.designpatterns.abstractfactory;

public class DarkComponentFactory implements IAbstractComponentFactory {
    @Override
    public AlertComponent createAlertComponent() {
        return new DarkThemedAlertWindow();
    }

    @Override
    public ButtonComponent createButtonComponent() {
        return new DarkButtonComponent();
    }
}
