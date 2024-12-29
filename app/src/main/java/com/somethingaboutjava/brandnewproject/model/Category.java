package com.somethingaboutjava.brandnewproject.model;

public class Category {

    int imageResId;
    int imageWidth;
    int imageHeight;

    public Category(int imageResId, int imageWidth, int imageHeight) {
        this.imageResId = imageResId;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
}
