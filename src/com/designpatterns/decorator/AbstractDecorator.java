package com.designpatterns.decorator;

/**
 * Generally we want all the decorators to either implement IDecorator
 * or extend AbstractDecorator to make it easy for readers to figure
 * out the intent.
 */
public abstract class AbstractDecorator implements Component {
    protected Component component;
    public AbstractDecorator(Component component){
        this.component = component;
    }
}
