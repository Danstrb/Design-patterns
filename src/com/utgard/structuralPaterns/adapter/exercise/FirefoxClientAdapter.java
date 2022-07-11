package com.utgard.structuralPaterns.adapter.exercise;

import com.utgard.structuralPaterns.adapter.exercise.firefox.FirefoxClient;

public class FirefoxClientAdapter implements EmailProvider {
    private FirefoxClient firefoxClient;

    public FirefoxClientAdapter(FirefoxClient firefoxClient) {
        this.firefoxClient = firefoxClient;
    }

    @Override
    public void downloadEmails() {
        firefoxClient.connect();
        firefoxClient.saveEmails();
        firefoxClient.disconnect();
    }
}
