package com.utgard.behavioralPatterns.iterator.practice;

public interface Iterator<T> {
    boolean hasNext();
    void next();
    T current();
}
