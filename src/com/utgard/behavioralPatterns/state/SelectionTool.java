package com.utgard.behavioralPatterns.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseDown() {
        System.out.println("Drawing a dashed rectangle");
    }
}
