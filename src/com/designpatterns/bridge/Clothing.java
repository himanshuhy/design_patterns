package com.designpatterns.bridge;

/**
 * Generally we can have the abstraction in a bridge pattern as an abstract class
 * because in all sense, Adult or Teenager are Persons which is an 'is-a' relationship
 */
public abstract class Clothing {
    protected IFabricColor fabricColor;

    public Clothing(IFabricColor fabricColor) {
        this.fabricColor = fabricColor;
    }
    public abstract String getDescription();
}
