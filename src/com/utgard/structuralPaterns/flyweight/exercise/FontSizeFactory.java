package com.utgard.structuralPaterns.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;

public class FontSizeFactory {
    private Map<Integer, Integer> sizes = new HashMap<>();

    public int getSize(int size) {
        if (!sizes.containsKey(size)) {
            var newSize = size;
            sizes.put(size, size);
        }

        return sizes.get(size);
    }
}
