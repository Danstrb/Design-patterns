package com.utgard.behavioralPatterns.mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> handlers = new ArrayList<>();

    public void add(EventHandler handler) {
        handlers.add(handler);
    }

    protected void notifyHandlers() {
        for (var handler : handlers)
            handler.handle();
    }
}
