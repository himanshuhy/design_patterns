package com.designpatterns.iterator;

/**
 * Base abstraction for animals. Reason I didnt chose abstract class is, I dont want to indicate 'is-a' relationship
 * because of differnet types of animals, rather we will use something simple, like getAnimalID() behavior on every
 * animal in the Zoo
 */
public interface Animal {
    public int getAnimalID();
}
