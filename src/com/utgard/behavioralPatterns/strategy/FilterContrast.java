package com.utgard.behavioralPatterns.strategy;

public class FilterContrast implements Filter {
    @Override
    public void filter() {
        System.out.println("Applying contrast filter");
    }
}
