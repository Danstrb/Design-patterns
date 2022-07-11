package com.utgard.structuralPaterns.adapter.exercise;

import com.utgard.structuralPaterns.adapter.exercise.firefox.FirefoxClient;
import com.utgard.structuralPaterns.adapter.exercise.gmail.GmailClient;

public class AdapterExerciseDemo {
    public void demo() {
        var client = new EmailClient();
        client.addProvider(new GmailClientAdapter(new GmailClient()));
        client.addProvider(new FirefoxClientAdapter(new FirefoxClient()));
        client.downloadEmails();
    }
}
