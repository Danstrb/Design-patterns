package com.utgard.behavioralPatterns.command.exercise.mosh;

public class Demo {
    public static void show() {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand1 = new SetTextCommand("Video Title", videoEditor, history);
        setTextCommand1.execute();
        System.out.println("TEXT: " + videoEditor);

        var setTextCommand2 = new SetTextCommand("Video Title 2", videoEditor, history);
        setTextCommand2.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast1 = new SetContrastCommand(1, videoEditor, history);
        setContrast1.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var setContrast2 = new SetContrastCommand(2, videoEditor, history);
        setContrast2.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}

