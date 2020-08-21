package com.designpatterns.decorator;

public class LowerCaseComponentDecorator implements Component {
    private final Component component;

    public LowerCaseComponentDecorator(Component component) {
        this.component = component;
    }
    @Override
    public String getName() {
        return this.component.getName().toLowerCase();
    }
}
