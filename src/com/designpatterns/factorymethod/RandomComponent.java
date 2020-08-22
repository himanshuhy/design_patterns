package com.designpatterns.factorymethod;

import java.util.Random;

public class RandomComponent implements Component {
    private final int level;
    private final int MAX_LEVEL = 20;
    public RandomComponent() {
        Random random = new Random();
        this.level = random.nextInt(MAX_LEVEL+1);
    }
    @Override
    public void something() {
        System.out.println("Randomly selected level: " + this.level);
    }
}
