package com.designpatterns.iterator;

public class Lion implements Animal {
    private int id;

    public Lion() {
        this.id = (int) (Math.random() * 100);
    }

    @Override
    public int getAnimalID() {
        return id;
    }
}
