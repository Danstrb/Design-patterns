package com.utgard.creationalPatterns.factoryExercise;

public class ArabScheduler extends Scheduler {
    @Override
    public Calendar createCalendar() {
        return new ArabCalendar();
    }
}
