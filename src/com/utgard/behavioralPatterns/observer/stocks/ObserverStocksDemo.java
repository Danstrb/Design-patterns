package com.utgard.behavioralPatterns.observer.stocks;

public class ObserverStocksDemo {
    public void practice() {
        var stockPrice = new StockPrice();
        var statusBar1 = new StatusBar(stockPrice);
        var statusBar2 = new StatusBar(stockPrice);
        var statusListView = new StatusListView(stockPrice);

        stockPrice.addObserver(statusBar1);
        stockPrice.addObserver(statusBar2);
        stockPrice.addObserver(statusListView);

        stockPrice.setPrice(1);
    }
}
