package com.utgard.behavioralPatterns.strategy;

public class CompressPNG implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing PNG");
    }
}
