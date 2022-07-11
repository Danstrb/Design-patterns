package com.utgard.behavioralPatterns.memento;

public class Editor {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }

}
// WORKING BUT NOT OOP
//package com.utgard.behavioralPatterns.memento;
//
//        import java.util.Stack;
//
//public class Editor {
//    private String content;
//    private Stack<String> stackFirst = new Stack<>();
//    private Stack<String> stackSecond = new Stack<>();
//
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        pushStacks();
//        this.content = content;
//    }
//
//    public void undo() {
//        undoContent();
//    }
//
//    private void pushStacks() {
//        stackFirst.push(getContent());
//        stackSecond.push(content);
//    }
//
//    private void undoContent() {
//        stackSecond.pop();
//        this.content = stackFirst.pop();
//    }
//}

