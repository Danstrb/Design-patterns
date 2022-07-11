package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public class ExcelDataSource extends Handler {
    public ExcelDataSource(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }
        return false;
    }
}
