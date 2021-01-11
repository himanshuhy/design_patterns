package com.designpatterns.iterator;

public class Tiger implements Animal {
    private int id;

    public Tiger() {
        this.id = (int) (Math.random() * 100);
    }

    @Override
    public int getAnimalID() {
        return id;
    }
}
