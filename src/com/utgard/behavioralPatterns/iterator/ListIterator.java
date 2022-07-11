package com.utgard.behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ListIterator implements Iterator {
    private List<String> list = new ArrayList<>();
    private int index = -1;

    public ListIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index+1 < list.size(); //or return list.get(index+1) != null;
    }

    @Override
    public String getNext() {
        return list.get(++index);
    }

    @Override
    public String current() {
        return list.get(index);
    }
}
