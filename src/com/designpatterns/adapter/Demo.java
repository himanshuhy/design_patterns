package com.designpatterns.adapter;

public class Demo {
    public static void main(String[] args) {
        //some method that will demo our adapter.
        IServiceAdapter adapter = new CalculatorServiceAdapter();
        System.out.println(adapter.getsum(1,11));
    }
}
