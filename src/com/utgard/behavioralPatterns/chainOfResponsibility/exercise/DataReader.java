package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public class DataReader {
    private Handler handler;
    public DataReader(Handler next) {
        this.handler = next;
    }

    public void read(String fileName) {
        handler.handle(fileName);
    }
}
