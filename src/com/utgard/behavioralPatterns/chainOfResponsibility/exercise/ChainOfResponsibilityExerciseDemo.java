package com.utgard.behavioralPatterns.chainOfResponsibility.exercise;

public class ChainOfResponsibilityExerciseDemo {
    //excel -> numbers -> quickBook -> unsupported
    public void demo() {
        var unsupported = new UnsupportedDataSource(null);
        var quickBook = new QuickBooksDataSource(unsupported);
        var numbers = new NumbersDataSource(quickBook);
        var excel = new ExcelDataSource(numbers);

        var dataReader = new DataReader(excel);
        dataReader.read("practice.bw");
    }
}
