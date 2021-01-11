package com.designpatterns.iterator;

/**
 * Classes that produce Iterator are iterable.
 * Iterable of type T means, when we iterate, we get T type objects
 */
public interface Iterable <T> {
    public Iterator<T> getIterator();
}
