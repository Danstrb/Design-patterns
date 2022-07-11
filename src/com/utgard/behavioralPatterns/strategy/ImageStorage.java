package com.utgard.behavioralPatterns.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String filename) {
        filter.filter();
        compressor.compress();
        System.out.println("Storing file " + filename);
    }
}
