package com.utgard.behavioralPatterns.visitor.exercise;

public class AddHum implements IFilter {
    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("AddHum Formatsegment");
    }

    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("AddHum Factsegment");
    }
}
