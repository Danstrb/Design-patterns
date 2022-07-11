package com.utgard.behavioralPatterns.visitor.exercise;

public class ReverbFilter implements IFilter {
    @Override
    public void filter(FormatSegment formatSegment) {
        System.out.println("Reverb Formatsegment");
    }

    @Override
    public void filter(FactSegment factSegment) {
        System.out.println("Reverb Factsegment");
    }
}
