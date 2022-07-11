package com.utgard.structuralPaterns.adapter;

public class ImageView {
    public Image getImage() {
        return image;
    }

    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter) {
        filter.apply(image);
    }
}
