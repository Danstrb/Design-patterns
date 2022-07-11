package com.utgard.behavioralPatterns.state.my_state;

public class Eraser implements Action {

    @Override
    public void mouseUp() {
        System.out.println("Cursor rubber");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erasing");
    }
}
