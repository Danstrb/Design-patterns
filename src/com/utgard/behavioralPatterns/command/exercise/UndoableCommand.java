package com.utgard.behavioralPatterns.command.exercise;

public interface UndoableCommand extends Command {
    void unexecute();
}
