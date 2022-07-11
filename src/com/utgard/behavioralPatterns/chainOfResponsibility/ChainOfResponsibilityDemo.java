package com.utgard.behavioralPatterns.chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public void demo() {
        //authentication -> logging -> compressing
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "1234"));
    }
}
