package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public class NumbersDataSource extends Handler {
    public NumbersDataSource(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileName) {
        if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }
        return false;
    }
}
