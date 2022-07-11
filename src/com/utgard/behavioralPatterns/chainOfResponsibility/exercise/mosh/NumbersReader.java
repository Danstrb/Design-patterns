package com.utgard.behavioralPatterns.chainOfResponsibility.exercise.mosh;

public class NumbersReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected void doRead(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet: ");
    }
}
