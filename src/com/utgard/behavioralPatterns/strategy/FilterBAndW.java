package com.utgard.behavioralPatterns.strategy;

public class FilterBAndW implements Filter {
    @Override
    public void filter() {
        System.out.println("Applying B&W filter");
    }
}
