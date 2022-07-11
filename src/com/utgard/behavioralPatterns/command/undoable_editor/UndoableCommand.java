package com.utgard.behavioralPatterns.command.undoable_editor;

public interface UndoableCommand extends Command {
    void unExecute();
}
