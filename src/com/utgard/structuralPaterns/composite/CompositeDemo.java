package com.utgard.structuralPaterns.composite;

public class CompositeDemo {
    public void demo() {
        var shape1 = new Shape();
        var shape2 = new Shape();
        var shape3 = new Shape();
        var shape4 = new Shape();

        var group1 = new Group();
        group1.add(shape1);
        group1.add(shape2);

        var group2 = new Group();
        group2.add(shape3);
        group2.add(shape4);

        var group3 = new Group();
        group3.add(group1);
        group3.add(group2);

        group1.move();
        group3.render();
        group2.move();
    }
}
