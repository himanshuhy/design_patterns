package com.designpatterns.decorator;

public class Demo {
    private static final String string = "AaAaAa";
    public static void main(String[] args){
        Component impl = new ConcreteComponentImpl(string);

        assert impl.getName().equals(string);

        Component upperCase = new CapitaliseComponentDecorator(impl);

        assert upperCase.getName().equals(string.toUpperCase());

        Component lowerCase = new LowerCaseComponentDecorator(impl);

        assert lowerCase.getName().equals(string.toLowerCase());
    }
}
