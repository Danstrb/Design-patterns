package com.utgard.structuralPaterns.composite.exercise;

public class HumanResource implements Resource {
    @Override
    public void deploy() {
        System.out.println("Deploying human resource");
    }
}
