package com.utgard.behavioralPatterns.command.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.removeLast();
    }

    public int size() {
        return commands.size();
    }
}
