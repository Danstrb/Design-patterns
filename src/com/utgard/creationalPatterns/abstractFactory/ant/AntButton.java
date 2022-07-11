package com.utgard.creationalPatterns.abstractFactory.ant;

import com.utgard.creationalPatterns.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
