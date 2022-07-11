package com.utgard.behavioralPatterns.observer.stocksv2;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Stock stock) {
        for (var observer : observers)
            observer.update(stock);
    }
}
