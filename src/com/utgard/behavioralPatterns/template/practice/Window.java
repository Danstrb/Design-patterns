package com.utgard.behavioralPatterns.template.practice;

public abstract class Window {
    public void close() {
        doBeforeExecute();

        System.out.println("Removing the window from the screen");

        doAfterExecute();
    }

    protected abstract void doBeforeExecute();
    protected abstract void doAfterExecute();
}
