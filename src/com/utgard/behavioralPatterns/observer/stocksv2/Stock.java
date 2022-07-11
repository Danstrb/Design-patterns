package com.utgard.behavioralPatterns.observer.stocksv2;

public class Stock extends Subject {
    private int value;
    private String name;


    public Stock(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers(this);
    }
}
