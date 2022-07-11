package com.utgard.behavioralPatterns.iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        Iterator<Product> iterator = new ListIterator();
        return iterator;
    }

    private class ListIterator<T> implements Iterator {
        private int count;

        @Override
        public boolean hasNext() {
            return count < products.size();
        }

        @Override
        public void next() {
            count++;
        }

        @Override
        public Product current() {
            return products.get(count);
        }
    }

}
