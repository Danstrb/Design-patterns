package com.utgard.structuralPaterns.proxy.exercise;

public class ProductProxy implements Product {
    private int id;
    private String name;
    private RealProduct realProduct;
    private DbContext context;

    public ProductProxy(int id, DbContext context) {
        this.id = id;
        this.context = context;
    }

    @Override
    public int getId() {
        if (realProduct == null)
            realProduct = new RealProduct(id);

        return realProduct.getId();
    }

    @Override
    public String getName() {
        if (realProduct == null)
            realProduct = new RealProduct(id);

        return realProduct.getName();
    }

    @Override
    public void setName(String name) {
        if (realProduct == null)
            realProduct = new RealProduct(id);

        context.markAsChanged(this);
        realProduct.setName(name);
    }
}
