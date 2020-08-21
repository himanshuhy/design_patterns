package com.designpatterns.decorator;

/**
 * Some implementation for the component. In this example, we are saying some Name is entered by the user
 * which is stored in the component. it could have mixed casing/camel casing or whatever.
 */
public class ConcreteComponentImpl implements Component {
    private String name;
    public ConcreteComponentImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
