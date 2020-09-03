package com.designpatterns.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * A composite is a structure made up of smaller structures.
 * It forms a tree like structure.
 */
public class CompositePiece implements Component {

    private List<Component> componentList = new LinkedList<>();

    public CompositePiece(final List<Component> componentList) {
        this.componentList = componentList;
    }

    @Override
    public int getCost() {
        int sum = 0;
        for (Component component: componentList) {
            sum += component.getCost();
        }
        return sum;
    }
}
