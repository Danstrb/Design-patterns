package com.utgard.creationalPatterns.factoryExercise;

public class FactoryExerciseDemo {
    public static void show() {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        var arabianScheduler = new ArabScheduler();
        arabianScheduler.schedule(new Event());
    }
}
