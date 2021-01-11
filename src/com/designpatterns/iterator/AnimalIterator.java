package com.designpatterns.iterator;

import java.util.List;

/**
 * In our example we have chosen a wrapper over list. But in real life it could be a different datastructure
 * The data structure might be custom made which is non-iterable type, and hence we would have to write our own code
 * to navigate it.
 */
public class AnimalIterator implements Iterator<Animal> {
    private List<Animal> animals;
    private int index;

    public AnimalIterator(List<Animal> animals) {
        this.animals = animals;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < animals.size();
    }

    @Override
    public Iterator<Animal> next() {
        index++;
        return this;
    }

    @Override
    public Animal getCurrent() {
        return animals.get(index);
    }
}
