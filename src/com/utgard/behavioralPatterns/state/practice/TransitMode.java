package com.utgard.behavioralPatterns.state.practice;

public class TransitMode implements Mode {

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Transit)");
        return 3;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Transit)");
        return 3;
    }
}
