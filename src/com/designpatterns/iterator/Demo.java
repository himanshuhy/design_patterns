package com.designpatterns.iterator;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo(Arrays.asList(new Tiger(), new Lion(), new Tiger(), new Lion()));

        final Iterator<Animal> iterator = myZoo.getIterator();

        while (iterator.hasNext()) {
            final Animal current = iterator.getCurrent();
            iterator.next();
            System.out.println(current.getAnimalID());
        }
    }
}
