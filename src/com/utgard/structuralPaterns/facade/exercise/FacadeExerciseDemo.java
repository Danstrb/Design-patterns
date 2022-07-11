package com.utgard.structuralPaterns.facade.exercise;

public class FacadeExerciseDemo {
    public static void demo() {
        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(new TwitterAPI("appKey", "appSecret").getAccess());
    }
}