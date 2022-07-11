package com.utgard.behavioralPatterns.strategy.practice;

public class OtherEncryption implements Encryption {
    @Override
    public void apply() {
        throw new UnsupportedOperationException("Unsupported Encryption Error");
    }
}
