package com.designpatterns.adapter;

import java.util.Arrays;

/**
 * For different adaptee's we want different adapters.
 */
public class CalculatorServiceAdapter implements IServiceAdapter {

    private final SomeCalculator calc;

    /**
     * we can use constructor wiring as well.
     */
    public CalculatorServiceAdapter() {
        this.calc = new SomeCalculator();
    }
    @Override
    public int getsum(int i, int j) {
        return calc.summAll(Arrays.asList(i,j));
    }
}
