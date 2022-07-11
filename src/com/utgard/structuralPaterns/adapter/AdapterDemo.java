package com.utgard.structuralPaterns.adapter;

public class AdapterDemo {
    public void demo() {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelAdapter());
    }
}
