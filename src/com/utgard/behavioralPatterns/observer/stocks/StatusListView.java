package com.utgard.behavioralPatterns.observer.stocks;

public class StatusListView implements Observer {
    private StockPrice stockPrice;

    public StatusListView(StockPrice stockPrice) {
        this.stockPrice = stockPrice;
    }

    @Override
    public void update() {
        System.out.println("StatusListView price got updated: " + stockPrice.getPrice());
    }
}
