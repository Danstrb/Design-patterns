package com.utgard.creationalPatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright"));
            for (var slide : slides)
                builder.addSlide(slide);
        System.out.println("Exported to" + builder);
    }
}
