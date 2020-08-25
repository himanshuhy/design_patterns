package com.designpatterns.adapter;

/**
 * We create interface for adapters, as we want to have adapters for a lot of things in an application
 * things like external libraries that will change again and agian, we dont want to expose their interfaces
 * to internal of our application.
 *
 * Adapters are also called as wrappers. In this case we have created an adapter over external service calls.
 */
public interface IServiceAdapter {

    //Adapter to possible calculators, where effectively we want sum of 2 numbers.
    public int getsum(int i, int j);
}
