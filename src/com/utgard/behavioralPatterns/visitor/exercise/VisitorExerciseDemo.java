package com.utgard.behavioralPatterns.visitor.exercise;

public class VisitorExerciseDemo {
    public void demo() {
        var wavFile = new WavFile();
        wavFile.add(new FactSegment());
        wavFile.add(new FormatSegment());
        wavFile.add(new FormatSegment());

        wavFile.execute(new AddHum());
    }
}
