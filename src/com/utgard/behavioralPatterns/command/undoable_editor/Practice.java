package com.utgard.behavioralPatterns.command.undoable_editor;

public class Practice {
    public void practice() {
        var history = new History();
        var document = new HtmlDocument();
        var bold = new BoldCommand(document, history);

        document.setContent("Hello world");
        bold.execute();
        System.out.println(document.getContent());
        bold.unExecute();
        System.out.println(document.getContent());

        var undo = new UndoCommand(history);
        bold.execute();
        System.out.println(document.getContent());
        undo.execute();
        System.out.println(document.getContent());
    }
}
