package com.utgard.behavioralPatterns.visitor;

public class HighlighOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Highlight-heading");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Highlight-anchor");
    }
}
