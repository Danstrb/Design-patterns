package com.utgard.creationalPatterns.abstractFactory.app;

import com.utgard.creationalPatterns.abstractFactory.WidgetFactory;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}
