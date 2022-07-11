package com.utgard.behavioralPatterns.visitor.exercise;

public class FormatSegment extends Segment {
    @Override
    public void applyFilter(IFilter filter) {
        filter.filter(this);
    }
}
