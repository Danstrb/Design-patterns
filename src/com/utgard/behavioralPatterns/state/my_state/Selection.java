package com.utgard.behavioralPatterns.state.my_state;

public class Selection implements Action {
    @Override
    public void mouseUp() {
        System.out.println("Cross cursor");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selecting");
    }
}
