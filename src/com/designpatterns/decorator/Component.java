package com.designpatterns.decorator;

/**
 * Some interface that is existing/base object for the decorator. Decorators are added as additional functionality
 * on top of existing classes and not a property of the base class itself. Hence the Component is a generic component
 * with no connectionw with the decorator whatsoever.
 */
public interface Component {

    public String getName();

}
