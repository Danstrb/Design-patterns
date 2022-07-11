package com.utgard.behavioralPatterns.mediator.exercise;

public class TextBox extends UIControl {
    private String content;

    public TextBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyHandlers();
    }
}
