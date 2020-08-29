package com.designpatterns.bridge;

public class Demo {
    public static void main(String[] args) {
        /*
        Normally we would have to create N*M types of classes for different type of clothing and colors.
        eg Blue pant, red Shirt, Brown Sweater etc
        Adapter pattern injects the implementations to the abstraction, by making both separate family of classes
        so that we can compose N*M different variations using N+M classes.
         */
        Clothing clothing1 = new Pants(new RedFabric());
        System.out.println(clothing1.getDescription());
        Clothing clothing2 = new TShirt(new BlueFabric());
        System.out.println(clothing2.getDescription());
    }
}
