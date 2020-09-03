package com.designpatterns.composite;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Component> list = new LinkedList<>();
        list.add(new LeafComponent());
        list.add(new LeafComponent());
        list.add(new LeafComponent());
        list.add(new LeafComponent());
        list.add(new LeafComponent());
        list.add(new LeafComponent());
        list.add(new LeafComponent());
        Component compositePiece= new CompositePiece(list);
        System.out.println(compositePiece.getCost());
    }
}
