package com.utgard.behavioralPatterns.template.practice;

public class WindowA extends Window {

    @Override
    protected void doBeforeExecute() {
        System.out.println("Saving");
    }

    @Override
    protected void doAfterExecute() {}
}
