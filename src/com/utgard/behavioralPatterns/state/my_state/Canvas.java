package com.utgard.behavioralPatterns.state.my_state;

public class Canvas {
    private ToolType currentTool;
    private Action action;

    public void execute(ToolType currentTool) {
        if (currentTool == ToolType.SELECTION)
            action = new Selection();
        else if (currentTool == ToolType.BRUSH)
            action = new Brush();
        else if (currentTool == ToolType.ERASER)
            action = new Eraser();

        action.mouseUp();
        action.mouseDown();
        action.mouseUp();
    }
}
