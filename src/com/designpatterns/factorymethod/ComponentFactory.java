package com.designpatterns.factorymethod;

/**
 * The factory is free to have whatever logic it has to create the object.
 * Only condition for factory method pattern is that it should only.<br>
 * (1) Support one type of family of classes (Component here)<br>
 * (2) Have a single public method. Having multiple essentially means it can
 * provide multiple different types of related objects (even though they might be of the
 * same family in class hierarchy but essentially it provides multiple.
 */
public interface ComponentFactory {
    public Component createComponent(int level);
}
