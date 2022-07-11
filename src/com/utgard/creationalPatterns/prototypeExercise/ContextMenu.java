package com.utgard.creationalPatterns.prototypeExercise;

public class ContextMenu {
    private Timeline timeline;

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
            var copy = component.clone();
            timeline.add(copy);
    }
}
