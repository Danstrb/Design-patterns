package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public class QuickBooksDataSource extends Handler {
    public QuickBooksDataSource(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileName) {
        if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
            return true;
        }
        return false;
    }
}
