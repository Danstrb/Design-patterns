package com.utgard.behavioralPatterns.strategy.practice;

public class DESEncryption implements Encryption {
    @Override
    public void apply() {
        System.out.println("Encrypting using DES");
    }
}
