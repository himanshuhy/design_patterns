package com.designpatterns.strategy;

public class SlowRunnerStrategy implements IRunStrategy {

    public void run(){
        System.out.println("Running slowly!!");
    }
}
