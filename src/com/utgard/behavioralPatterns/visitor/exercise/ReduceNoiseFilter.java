package com.utgard.behavioralPatterns.visitor.exercise;

public class ReduceNoiseFilter implements IFilter {
    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Reduce noise Formatsegment");
    }

    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Reduce noise Factsegment");
    }
}
