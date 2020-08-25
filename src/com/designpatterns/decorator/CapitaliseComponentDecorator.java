package com.designpatterns.decorator;

/**
 * This class is a decorator/wrapper on top of component. It will provide all the public API of Component
 * and can actually intercept the calls and tweak as will.
 */
public class CapitaliseComponentDecorator extends AbstractDecorator {

    public CapitaliseComponentDecorator(Component component) {
        super(component);
    }

    @Override
    public String getName() {
        return this.component.getName().toUpperCase();
    }
}
