package com.utgard.behavioralPatterns.visitor;

public class VisitorDemo {
    public void demo() {
        var document = new HtmlDocument();
        document.add(new AnchorNode());
        document.add(new HeadingNode());
        document.execute(new PlainTextOperation());
    }
}
