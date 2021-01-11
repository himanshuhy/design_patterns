package com.designpatterns.iterator;

/**
 * Interface to traverse an iterable object.
 */
public interface Iterator<T> {
    public boolean hasNext();
    public Iterator<T> next();
    public T getCurrent();
}
