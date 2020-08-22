package com.designpatterns.factorymethod;

/**
 * Some family that whose construction is supposedly complex
 * and is constructed many places so we want to reuse the code using factories.
 *
 * Its also possible that we want the different implementations of Component based on input
 *
 * Different implementations of factory could have different algorithms
 *
 */
public interface Component {
    public void something();
}
