package com.utgard.creationalPatterns.abstractFactory.ant;

import com.utgard.creationalPatterns.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
