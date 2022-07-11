package com.utgard.creationalPatterns.abstractFactory;

import com.utgard.creationalPatterns.abstractFactory.ant.AntWidgetFactory;
import com.utgard.creationalPatterns.abstractFactory.app.ContactForm;
import com.utgard.creationalPatterns.abstractFactory.material.MaterialWidgetFactory;

public class AbstractFactoryDemo {
    public void show() {
        new ContactForm().render(new AntWidgetFactory());
    }
}
