package com.utgard.creationalPatterns.abstractFactoryExercise;

public class WeightLossFactory implements GoalFactory {
    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMealPlan();
    }

    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeightLossWorkout();
    }
}
