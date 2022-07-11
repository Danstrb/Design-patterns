package com.utgard.behavioralPatterns.memento.practice;

public class MementoPractice {
    public void practice() {
    var document = new Document();
    var history = new History();
    document.setContent("A");

    history.push(document.createState());
    document.setContent("B");

    history.push(document.createState());
    document.setContent("C");

    history.push(document.createState());
    document.setFontName("NotThatFancy");

    history.push(document.createState());
    document.setFontName("Fancy");

    history.push(document.createState());
    document.setFontSize(20);

    history.push(document.createState());
    document.setFontSize(15);

    history.push(document.createState());
    document.setFontSize(11);

    document.restore(history.pop());
    document.restore(history.pop());


    }
}
