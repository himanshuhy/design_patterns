package com.designpatterns.command;

/**
 * Some random class which is part of the "commands" that we have in our system.
 */
public class Calculator {

    private final Data data;

    public Calculator(int seed) {
        this.data = new Data(seed);
    }

    public void twice() {
        this.data.value *= 2;
        System.out.println("Twice called new value: " + this.data.value);
    }

    public void half() {
        this.data.value /= 2;
        System.out.println("Half called new value: " + this.data.value);
    }
}
