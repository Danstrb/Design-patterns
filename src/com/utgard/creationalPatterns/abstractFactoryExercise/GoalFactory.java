package com.utgard.creationalPatterns.abstractFactoryExercise;

public interface GoalFactory {
    MealPlan createMealPlan();
    WorkoutPlan createWorkoutPlan();
}
