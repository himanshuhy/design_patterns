package com.designpatterns.factorymethod;

public class LevelBasedComponent implements Component{
    private final int level;
    public LevelBasedComponent(int level) {
        this.level = level;
    }
    @Override
    public void something() {
        System.out.println("Level: " + this.level);
    }
}
