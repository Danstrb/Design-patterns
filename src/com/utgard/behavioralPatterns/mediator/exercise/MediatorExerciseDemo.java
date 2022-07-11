package com.utgard.behavioralPatterns.mediator.exercise;

public class MediatorExerciseDemo {
    public void demo() {
        var signUpDialogBox = new SignUpDialogBox();
        signUpDialogBox.showStatus();
        signUpDialogBox.simulateUserInteraction();
        signUpDialogBox.showStatus();
    }
}
