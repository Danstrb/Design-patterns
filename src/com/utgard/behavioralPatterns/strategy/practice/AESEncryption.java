package com.utgard.behavioralPatterns.strategy.practice;

public class AESEncryption implements Encryption {
    @Override
    public void apply() {
        System.out.println("Encrypting using AES");
    }
}
