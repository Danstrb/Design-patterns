package com.utgard.behavioralPatterns.memento.practice;

import java.util.Stack;

public class History {
    private Stack<DocumentState> stack = new Stack<>();

    public void push (DocumentState state) {
        stack.push(state);
    }

    public DocumentState pop () {
        return stack.pop();
    }
}
