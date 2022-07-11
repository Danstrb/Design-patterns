package com.utgard.behavioralPatterns.observer.stocksv2;

import java.util.ArrayList;
import java.util.List;

public class StockBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void add(Stock stock) {
        stock.addObserver(this);
        stocks.add(stock);
    }

    @Override
    public void update(Stock stock) {
        var index = stocks.indexOf(stock);
        stocks.set(index, stock);
        System.out.println("StockBar got notified");
    }

    public void show() {
        System.out.println("Stock Bar: ");
        for (var stock : stocks)
            System.out.println(stock.getName() + " = " + stock.getValue());
        System.out.println();
    }
}
