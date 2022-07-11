package com.utgard.behavioralPatterns.state.practice;

public class BicyclingMode implements Mode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Bicycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Bicycling)");
        return 2;
    }
}
