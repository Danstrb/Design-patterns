package com.utgard.behavioralPatterns.strategy;

public class CompressJPEG implements Compressor {
    @Override
    public void compress() {
        System.out.println("Compressing JPEG");
    }
}
