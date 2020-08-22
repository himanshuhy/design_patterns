package com.designpatterns.factorymethod;

public class Demo {
    public static void main(String[] args) {
        ComponentFactory factory = new GameComponentFactory();
        Component component = factory.createComponent(-1);
        component.something();
        Component component2 = factory.createComponent(3);
        component2.something();
        Component component3 = factory.createComponent(13);
        component3.something();
    }
}
