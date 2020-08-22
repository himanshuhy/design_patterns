package com.designpatterns.abstractfactory;

/**
 * Difference with Abstract factory method is that this has support for related families.
 * Ex Alert Window and Button Component have themed requirements and this factory implementation
 * will provide the same.
 *
 * Generally the components will also have more challenges to create them, like complex logic etc.
 * Or perhaps, there could be different types of alert windows, and based on the selection of the user
 * ew could populate different types of themed alert component.
 */
public interface IAbstractComponentFactory {
    public AlertComponent createAlertComponent();
    public ButtonComponent createButtonComponent();
}
