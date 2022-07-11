package com.utgard.behavioralPatterns.visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class OriginalWavFile {
    private List<OriginalSegment> segments = new ArrayList<>();

    public static OriginalWavFile read(String fileName) {
        // Simulate reading a wav file and building the segments
        var wavFile = new OriginalWavFile();
        wavFile.segments.add(new OriginalFormatSegment());
        wavFile.segments.add(new OriginalFactSegment());
        wavFile.segments.add(new OriginalFactSegment());
        wavFile.segments.add(new OriginalFactSegment());

        return wavFile;
    }

    public void reduceNoise() {
        for (var segment : segments)
            segment.reduceNoise();
    }

    public void addReverb() {
        for (var segment : segments)
            segment.addReverb();
    }

    public void normalize() {
        for (var segment : segments)
            segment.normalize();
    }
}
