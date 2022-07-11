package com.utgard.behavioralPatterns.command.exercise;

public class Demo {
    public void practice() {
//        NOT GREAT, BUT HIS SOLUTION PROBABLY WORKS SIMILARLY?

        var editor = new VideoEditor();
        var history = new History();

//        System.out.println(editor.getContrast());
        var setContrast = new SetContrastCommand(history, editor, 0.7f);
        setContrast.execute();
        System.out.println(editor);

        var setText = new SetTextCommand(history, editor, "Hello world");
        setText.execute();
        System.out.println(editor);

        var setText2 = new SetTextCommand(history, editor, "Goodbye world");
        setText2.execute();
        System.out.println(editor);

        var setContrast2 = new SetContrastCommand(history, editor, 2.7f);
        setContrast2.execute();
        System.out.println(editor);

        var setContrast3 = new SetContrastCommand(history, editor, 3.7f);
        setContrast3.execute();
        System.out.println(editor);

        var undo = new UndoCommand(history);
        undo.execute();
        System.out.println(editor);

        undo.execute();
        System.out.println(editor);

        undo.execute();
        System.out.println(editor);


    }
}
