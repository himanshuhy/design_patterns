package com.designpatterns.adapter;

import java.util.List;

/**
 * Adaptee: Some external class/or interface that we want to adapt to.
 * This external interface can change with time, we dont want to
 * limit the changes in our system to one place, the adapter.
 */
public class SomeCalculator {

    public int summAll(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
