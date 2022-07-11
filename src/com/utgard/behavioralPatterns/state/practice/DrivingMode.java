package com.utgard.behavioralPatterns.state.practice;

public class DrivingMode implements Mode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Driving)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}
