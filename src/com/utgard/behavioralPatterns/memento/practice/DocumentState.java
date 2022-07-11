package com.utgard.behavioralPatterns.memento.practice;

public class DocumentState {
    private String contentState;
    private String fontNameState;
    private int fontSizeState;

    public DocumentState(String contentState, String fontName, int fontSizeState) {
        this.contentState = contentState;
        this.fontNameState = fontName;
        this.fontSizeState = fontSizeState;
    }

    public String getContentState() {
        return contentState;
    }

    public String getFontNameState() {
        return fontNameState;
    }

    public int getFontSizeState() {
        return fontSizeState;
    }
}
