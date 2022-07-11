package com.utgard.creationalPatterns.factoryExercise;

import java.util.Date;

public class GregorianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("Gregorian - Adding an event on the given date.");
    }
}
