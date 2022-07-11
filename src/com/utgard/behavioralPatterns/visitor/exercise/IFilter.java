package com.utgard.behavioralPatterns.visitor.exercise;

public interface IFilter {
    void filter(FormatSegment formatSegment);
    void filter(FactSegment factSegment);
}
