package com.utgard.creationalPatterns.builder;

public class BuilderDemo {
    public void show() {
        var practice = new Presentation();
        practice.addSlide(new Slide("1"));
        practice.addSlide(new Slide("2"));
        practice.addSlide(new Slide("3"));
        practice.export(new MovieBuilder());
    }
}
