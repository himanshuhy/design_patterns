package com.designpatterns.singleton;

public class Demo {
    public static void main(String[] args) {
        //Not possible
        //Singleton singleton = new Singleton();
        System.out.println(Singleton.getINSTANCE().getSeed());
    }
}
