package com.designpatterns.bridge;

public class TShirt extends Clothing {
    public TShirt(IFabricColor fabricColor) {
        super(fabricColor);
    }

    @Override
    public String getDescription() {
        return this.fabricColor.getColor() + " colored T-Shirt";
    }
}
