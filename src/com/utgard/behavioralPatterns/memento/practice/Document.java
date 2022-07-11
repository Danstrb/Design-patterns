package com.utgard.behavioralPatterns.memento.practice;

public class Document {
        private String content;
        private String fontName;
        private int fontSize;

    public DocumentState createState() {
        return new DocumentState(content, fontName, fontSize);
    }

//        public DocumentState createContent() {
//            var contentState = new DocumentState();
//            contentState.setContentState(content);
//            return contentState;
//        }
//
//        public DocumentState createFontName() {
//            var fontNameState = new DocumentState();
//            fontNameState.setFontName(fontName);
//            return fontNameState;
//        }

        public void restore(DocumentState state) {
            content = state.getContentState();
            fontName = state.getFontNameState();
            fontSize = state.getFontSizeState();
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getFontName() {
            return fontName;
        }

        public void setFontName(String fontName) {
            this.fontName = fontName;
        }

        public int getFontSize() {
            return fontSize;
        }

        public void setFontSize(int fontSize) {
            this.fontSize = fontSize;
        }

        @Override
        public String toString() {
            return "Document{" +
                    "content='" + content + '\'' +
                    ", fontName='" + fontName + '\'' +
                    ", fontSize=" + fontSize +
                    '}';
        }
    }

