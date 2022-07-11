package com.utgard.behavioralPatterns.visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    List<Segment> segments = new ArrayList<>();

    public void add(Segment segment) {
        segments.add(segment);
    }

    public void execute(IFilter filter) {
        for (var segment : segments) {
            System.out.print(segment + ": ");
            segment.applyFilter(filter);
        }
    }
}
