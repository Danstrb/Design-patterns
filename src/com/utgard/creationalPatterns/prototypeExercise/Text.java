package com.utgard.creationalPatterns.prototypeExercise;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        var newText = new Text(content);

        return newText;
    }
}
