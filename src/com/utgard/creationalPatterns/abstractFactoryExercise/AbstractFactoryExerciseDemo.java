package com.utgard.creationalPatterns.abstractFactoryExercise;

public class AbstractFactoryExerciseDemo {
    public static void show() {
        var homePage = new HomePage();
        homePage.setGoal(new WeightLossFactory());
    }
}
