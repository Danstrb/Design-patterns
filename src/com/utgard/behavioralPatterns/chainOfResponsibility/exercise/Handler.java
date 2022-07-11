package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public abstract class Handler {
    private Handler next;
    protected String fileName;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(String fileName) {
        this.fileName = fileName;

        if (doHandle(fileName))
            return;

        if (next != null)
            next.handle(fileName);
    }

    public abstract boolean doHandle(String fileName);
}
