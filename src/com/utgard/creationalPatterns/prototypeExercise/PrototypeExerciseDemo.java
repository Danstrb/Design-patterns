package com.utgard.creationalPatterns.prototypeExercise;

public class PrototypeExerciseDemo {
    public void show() {
        var timeline = new Timeline();
        var text = new Text("Hello");
        timeline.add(text);

        var menu = new ContextMenu(timeline);
        menu.duplicate(text);
    }
}
