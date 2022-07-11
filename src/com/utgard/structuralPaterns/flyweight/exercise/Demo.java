package com.utgard.structuralPaterns.flyweight.exercise;

public class Demo {
    public static void show() {
        var sheet = new SpreadSheet();
        sheet.setContent(0, 0, "Hello");
        sheet.setContent(1, 0, "World");
        sheet.setFontFamily(0, 0, "Arial");
        sheet.setFontSize(1, 0, 10);
        sheet.render();
    }
}
