package com.utgard.behavioralPatterns.observer.stocks;

public class StockPrice extends Subject {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyObservers();
    }
}
