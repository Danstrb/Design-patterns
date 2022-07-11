package com.utgard.behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<String> iterable = new ArrayList<>();

    public void push(String string) {
        iterable.add(string);
    }

    public String pop() {
        var result = iterable.get(iterable.size()-1);
        iterable.remove(iterable.size()-1);
        return result;
    }
//    private String[] iterable = new String[20];
//    private int index = 0;
//
//    public void push(String string) {
//        iterable[index++] = string;
//    }

    public Iterator createIterator() {
        Iterator iterator = new ListIterator(iterable);
        return iterator;
    }
}
