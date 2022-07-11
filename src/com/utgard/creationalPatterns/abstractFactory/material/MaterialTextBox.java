package com.utgard.creationalPatterns.abstractFactory.material;

import com.utgard.creationalPatterns.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
