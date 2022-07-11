package com.utgard.creationalPatterns.abstractFactoryExercise;

public class BuildMuscleFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }
}
