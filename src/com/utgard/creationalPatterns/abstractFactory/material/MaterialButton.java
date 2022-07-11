package com.utgard.creationalPatterns.abstractFactory.material;

import com.utgard.creationalPatterns.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
