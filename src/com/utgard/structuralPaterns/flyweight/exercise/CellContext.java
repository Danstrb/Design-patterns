package com.utgard.structuralPaterns.flyweight.exercise;

public class CellContext {
    private String content;
    private String fontFamily;
    private int fontSize;
    private boolean isBold;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getBold() {
        return (isBold) ? "Bold" : "Not Bold";
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }
}
