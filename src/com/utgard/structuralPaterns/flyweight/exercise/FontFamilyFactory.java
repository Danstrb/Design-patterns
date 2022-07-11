package com.utgard.structuralPaterns.flyweight.exercise;


import java.util.HashMap;
import java.util.Map;

public class FontFamilyFactory {
    private Map<String, String> fontFamilies = new HashMap<>();

    public String getFontFamily(String fontName) {
        if (!fontFamilies.containsKey(fontName)) {
            var newFamily = fontName;
            fontFamilies.put(fontName, newFamily);
        }

        return fontFamilies.get(fontName);
    }
}
