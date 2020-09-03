package com.designpatterns.composite;

/**
 * The leaf level structure for the composite tree
 */
public class LeafComponent implements Component {
    @Override
    public int getCost() {
        return 1;
    }
}
