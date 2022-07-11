package com.utgard.structuralPaterns.facade.exercise;

import java.util.List;

public class TwitterAPI {
    private String appKey;
    private String appSecret;

    public TwitterAPI(String appKey, String appSecret) {
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public List<Tweet> getRecentTweets() {
        var client = new TwitterClient();
        var recentTweets = client.getRecentTweets(getAccess());

        return recentTweets;
    }

    public String getAccess() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken("appKey", "secret");
        var accessToken = oauth.getAccessToken(requestToken);

        return accessToken;
    }
}
