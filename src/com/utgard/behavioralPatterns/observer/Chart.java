package com.utgard.behavioralPatterns.observer;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart Got Updated: " + dataSource.getValue());
    }
}
