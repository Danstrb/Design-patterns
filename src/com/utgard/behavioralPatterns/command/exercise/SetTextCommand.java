package com.utgard.behavioralPatterns.command.exercise;

public class SetTextCommand implements UndoableCommand {
    private History history;
    private VideoEditor editor;
    private String newText;

    public SetTextCommand(History history, VideoEditor editor, String newText) {
        this.history = history;
        this.editor = editor;
        this.newText = newText;
    }

    @Override
    public void execute() {
        editor.setText(newText);
        history.push(this);
    }

    @Override
    public void unexecute() {
        editor.removeText();
    }
}
