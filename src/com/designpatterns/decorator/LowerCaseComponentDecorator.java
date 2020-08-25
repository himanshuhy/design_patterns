package com.designpatterns.decorator;

public class LowerCaseComponentDecorator extends AbstractDecorator {

    public LowerCaseComponentDecorator(Component component) {
        super(component);
    }
    @Override
    public String getName() {
        return this.component.getName().toLowerCase();
    }
}
