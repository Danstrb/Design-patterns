package com.utgard.behavioralPatterns.state.practice;

public class WalkingMode implements Mode {
    @Override
    public int getEta() {
        System.out.println("Calculating ETA (Walking)");
        return 4;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating Direction (Walking)");
        return 4;
    }
}
