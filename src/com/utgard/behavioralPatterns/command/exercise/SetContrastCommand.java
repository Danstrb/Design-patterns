package com.utgard.behavioralPatterns.command.exercise;

public class SetContrastCommand implements UndoableCommand {
    private History history;
    private VideoEditor editor;
    private float previousContrast;
    private float newContrast;

    public SetContrastCommand(History history, VideoEditor editor, float newContrast) {
        this.history = history;
        this.editor = editor;
        this.newContrast = newContrast;
    }

    @Override
    public void execute() {
        previousContrast = editor.getContrast();
        editor.setContrast(newContrast);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.setContrast(previousContrast);
    }
}
