package com.utgard.behavioralPatterns.template.practice;

public class WindowB extends Window {
    @Override
    public void doBeforeExecute() {
        System.out.println("Saving");
    }

    @Override
    public void doAfterExecute() {
        System.out.println("Cleaning up the mess");
    }
}
