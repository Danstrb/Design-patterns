package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public class UnsupportedDataSource extends Handler {
    public UnsupportedDataSource(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileName) {
        System.out.println("File format not supported.");
        return false;
    }
}
