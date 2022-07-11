package com.utgard.structuralPaterns.proxy;

public class ProxyDemo {
    public void demo() {
        var library = new Library();
        String[] fileNames = { "a", "b", "c" };
        for (var fileName : fileNames)
            library.add(new EbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
    }
}
