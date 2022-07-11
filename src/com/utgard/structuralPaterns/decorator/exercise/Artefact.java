package com.utgard.structuralPaterns.decorator.exercise;

public class Artefact implements ArtefactMarker {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    @Override
    public String render() {
        return name;
    }
}

