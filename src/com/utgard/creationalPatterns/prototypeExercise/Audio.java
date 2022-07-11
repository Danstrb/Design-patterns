package com.utgard.creationalPatterns.prototypeExercise;

public class Audio implements Component {
    @Override
    public Component clone() {
        var newAudio = new Audio();

        return newAudio;
    }
}
