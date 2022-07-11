package com.utgard.structuralPaterns.decorator.exercise;

public class MainMarker implements ArtefactMarker {
    private ArtefactMarker marker;

    public MainMarker(ArtefactMarker marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
        return marker.render() + markAsMain();
    }

    private String markAsMain() {
        return " [Main]";
    }
}
