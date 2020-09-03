package com.designpatterns.composite;

/**
 * The composite pattern is about structures than are composites of themselves.
 *
 * This is the basic structure interface. This will be used by the client to access the
 * composite structure, without knowing if its a composite or not
 */
public interface Component {
    public int getCost();
}
