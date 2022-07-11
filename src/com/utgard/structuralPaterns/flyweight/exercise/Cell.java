package com.utgard.structuralPaterns.flyweight.exercise;

public class Cell {
    private final int row;
    private final int column;
    private CellContext context;

    public Cell(int row, int column, CellContext content) {
        this.row = row;
        this.column = column;
        this.context = content;
    }

    public void setContext(String context) {
        this.context.setContent(context);
    }

    public void setFontFamily(String font) {
        context.setFontFamily(font);
    }

    public void setFontSize(int size) {
        context.setFontSize(size);}

    public void setBold(Boolean isBold) {
        context.setBold(isBold);}

     public void render() {
        System.out.printf("(%d, %d): %s [%s] [%d] [%s]\n", row, column, context.getContent(), context.getFontFamily(), context.getFontSize(), context.getBold());
    }
}

