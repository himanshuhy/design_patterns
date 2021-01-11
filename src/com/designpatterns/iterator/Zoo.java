package com.designpatterns.iterator;

import java.util.List;

/**
 * We have a forest that has animals in it. We can say that the forest is iterable on animals,
 * i.e. we can iterate over the animals of the forest.
 */
public class Zoo implements Iterable<Animal> {
    List<Animal> animals;
    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public Iterator<Animal> getIterator() {
        return new AnimalIterator(animals);
    }
}
