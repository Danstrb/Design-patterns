package com.utgard.behavioralPatterns.state.my_state;

public class Brush implements Action {
    @Override
    public void mouseUp() {
        System.out.println("Cursor brush");
    }

    @Override
    public void mouseDown() {
        System.out.println("Painting");
    }
}
