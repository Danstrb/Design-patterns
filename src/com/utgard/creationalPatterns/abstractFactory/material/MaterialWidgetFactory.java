package com.utgard.creationalPatterns.abstractFactory.material;

import com.utgard.creationalPatterns.abstractFactory.Button;
import com.utgard.creationalPatterns.abstractFactory.TextBox;
import com.utgard.creationalPatterns.abstractFactory.WidgetFactory;
import com.utgard.creationalPatterns.abstractFactory.material.MaterialButton;
import com.utgard.creationalPatterns.abstractFactory.material.MaterialTextBox;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
