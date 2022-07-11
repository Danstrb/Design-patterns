package com.utgard.creationalPatterns.prototypeExercise;

public class Clip implements Component {
    @Override
    public Component clone() {
        var newClip = new Clip();

        return newClip;
    }
}
