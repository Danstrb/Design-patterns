package com.utgard.behavioralPatterns.observer.stocks;

public class StatusBar implements Observer {
    private StockPrice stockPrice;

    public StatusBar(StockPrice stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Override
    public void update() {
        System.out.println("StatusBar price got updated: " + stockPrice.getPrice());
    }
}
