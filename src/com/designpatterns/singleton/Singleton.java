package com.designpatterns.singleton;

/**
 * If I make this class as final, no one can extend it and create objects of it.
 *
 * Creating public/global shared variable is not a good practice. Dont use this to avoid
 * unintended side affects.
 */
public final class Singleton {
    private Singleton(){
        this.seed = (int) Math.random()*100;
        //To make impossible to instantiate this class.
    }

    private int seed;

    public int getSeed() {
        return seed;
    }

    private static Singleton INSTANCE = new Singleton();
    public static Singleton getINSTANCE(){
        return INSTANCE;
    }
}
