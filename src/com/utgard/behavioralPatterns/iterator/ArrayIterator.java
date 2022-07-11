package com.utgard.behavioralPatterns.iterator;

public class ArrayIterator implements Iterator {
    private String[] array;
    private int index = -1;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index+1 < array.length;
    }

    @Override
    public String getNext() {
        return array[++index];
    }

    @Override
    public String current() {
        return array[index];
    }
}
