package com.utgard.structuralPaterns.flyweight;

public class FlyweightDemo {
    public void demo() {
        var service = new PointService(new PointIconFactory());
        for (var point : service.getPoint())
            point.draw();
    }
}
