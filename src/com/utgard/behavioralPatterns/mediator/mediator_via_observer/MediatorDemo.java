package com.utgard.behavioralPatterns.mediator.mediator_via_observer;

public class MediatorDemo {
    public void demo() {
        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInteraction();
    }
}
