package com.utgard.creationalPatterns.factoryExercise;

import java.util.Date;

public class ArabCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Arab - Adding an event on the given date.");
    }
}
