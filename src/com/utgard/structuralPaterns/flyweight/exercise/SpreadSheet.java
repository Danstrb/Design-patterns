package com.utgard.structuralPaterns.flyweight.exercise;

public class SpreadSheet {
    private final int MAX_ROWS = 3;
    private final int MAX_COLS = 3;

    // In a real app, these values should not be hardcoded here.
    // They should be read from a configuration file.
    private final String fontFamily = "Times New Roman";
    private final int fontSize = 12;
    private final boolean isBold = true;

    private Cell[][] cells = new Cell[MAX_ROWS][MAX_COLS];

    private FontFamilyFactory fontFamilyFactory = new FontFamilyFactory();
    private FontSizeFactory fontSizeFactory = new FontSizeFactory();
    private FontBoldFactory fontBoldFactory = new FontBoldFactory();

    public SpreadSheet() {
        generateCells();
    }

    public void setContent(int row, int col, String content) {
        ensureCellExists(row, col);

        cells[row][col].setContext(content);
    }

    public void setFontFamily(int row, int col, String fontFamily) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        cell.setFontFamily(fontFamilyFactory.getFontFamily(fontFamily)); // wat
    }

    public void setFontSize(int row, int col, int fontSize) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        cell.setFontSize(fontSizeFactory.getSize(fontSize));
    }

    public void setFontBold(int row, int col, boolean isBold) {
        ensureCellExists(row, col);

        var cell = cells[row][col];
        cell.setBold(fontBoldFactory.getFontBold(isBold));
    }

    private void ensureCellExists(int row, int col) {
        if (row < 0 || row >= MAX_ROWS)
            throw new IllegalArgumentException();

        if (col < 0 || col >= MAX_COLS)
            throw new IllegalArgumentException();
    }

    private void generateCells() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++) {
                var cell = new Cell(row, col, new CellContext());
                cell.setFontFamily(fontFamilyFactory.getFontFamily(fontFamily));
                cell.setFontSize(fontSizeFactory.getSize(fontSize));
                cell.setBold(fontBoldFactory.getFontBold(isBold));
                cells[row][col] = cell;
            }
    }

    public void render() {
        for (var row = 0; row < MAX_ROWS; row++)
            for (var col = 0; col < MAX_COLS; col++)
                cells[row][col].render();
    }
}
