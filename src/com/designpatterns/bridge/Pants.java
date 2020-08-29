package com.designpatterns.bridge;

public class Pants extends Clothing {
    public Pants(IFabricColor color){
        super(color);
    }

    @Override
    public String getDescription() {
        return this.fabricColor.getColor() + " colored Pant";
    }
}
