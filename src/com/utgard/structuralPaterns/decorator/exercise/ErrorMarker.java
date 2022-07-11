package com.utgard.structuralPaterns.decorator.exercise;

public class ErrorMarker implements ArtefactMarker {
    private ArtefactMarker marker;

    public ErrorMarker(ArtefactMarker marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
        return marker.render() + markAsError();
    }

    private String markAsError() {
        return " [Error]";
    }
}
