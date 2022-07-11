package com.utgard.behavioralPatterns.observer.stocksv2;

public class ObserverStocks2Demo {
    public void demo() {
        var tesla = new Stock("Tesla", 1);
        var porsche = new Stock("Porsche", 2);
        var vw = new Stock("VolksWagen", 4);
        var stockList = new StockList();
        var stockBar = new StockBar();

        stockList.add(tesla);
        stockList.add(porsche);
        stockList.add(vw);

        stockBar.add(tesla);
        stockBar.add(porsche);

        stockBar.show();
        stockList.show();

        vw.setValue(6);

        stockBar.show();
        stockList.show();
    }
}
