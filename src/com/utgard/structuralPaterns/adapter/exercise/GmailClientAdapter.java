package com.utgard.structuralPaterns.adapter.exercise;

import com.utgard.structuralPaterns.adapter.exercise.gmail.GmailClient;

public class GmailClientAdapter implements EmailProvider {
    private GmailClient gmailClient;

    public GmailClientAdapter(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
