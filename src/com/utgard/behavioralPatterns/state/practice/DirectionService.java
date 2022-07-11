package com.utgard.behavioralPatterns.state.practice;

public class DirectionService {

    private Mode travelMode;
    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public Mode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(Mode travelMode) {
        this.travelMode = travelMode;
    }
}
