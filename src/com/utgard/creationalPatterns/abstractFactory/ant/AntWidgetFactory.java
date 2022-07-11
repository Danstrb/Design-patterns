package com.utgard.creationalPatterns.abstractFactory.ant;

import com.utgard.creationalPatterns.abstractFactory.Button;
import com.utgard.creationalPatterns.abstractFactory.TextBox;
import com.utgard.creationalPatterns.abstractFactory.WidgetFactory;
import com.utgard.creationalPatterns.abstractFactory.ant.AntButton;
import com.utgard.creationalPatterns.abstractFactory.ant.AntTextBox;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
