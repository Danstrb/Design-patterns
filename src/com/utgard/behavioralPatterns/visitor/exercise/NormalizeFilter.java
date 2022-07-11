package com.utgard.behavioralPatterns.visitor.exercise;

public class NormalizeFilter implements IFilter {
    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Normalize Formatsegment");
    }

    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Normalize Factsegment");
    }
}
