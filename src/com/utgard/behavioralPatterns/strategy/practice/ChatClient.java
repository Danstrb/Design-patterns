package com.utgard.behavioralPatterns.strategy.practice;

public class ChatClient {
    private Enum encryptionEnum;

    public void send(String message, Encryption encryption) {
        encryption.apply();
        System.out.println("Sending the encrpted message...");
    }
}
