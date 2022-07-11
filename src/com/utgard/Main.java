package com.utgard;

import com.utgard.creationalPatterns.abstractFactory.AbstractFactoryDemo;
import com.utgard.creationalPatterns.abstractFactoryExercise.AbstractFactoryExerciseDemo;
import com.utgard.creationalPatterns.builder.BuilderDemo;
import com.utgard.creationalPatterns.builderExercise.BuilderExerciseDemo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        var practice = new BuilderExerciseDemo();
        practice.show();
    }
}
