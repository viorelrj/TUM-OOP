package com.labs.lab2.task1;

public class Box {
    private float height;
    private float width;
    private float depth;

    private float defaultSize = 1;

    public Box(float height, float width, float depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(float size) {
        this.height = size;
        this.width = size;
        this.depth = size;
    }

    public Box() {
        this.height = defaultSize;
        this.width = defaultSize;
        this.depth = defaultSize;
    }

    void printInfo() {
        System.out.println("height: " + height);
        System.out.println("width: " + width);
        System.out.println("depth: " + depth);
    }

    float getVolume() {
        return height * width * depth;
    }

    float getSurfaceArea() {
        float face1 = width * height;
        float face2 = width * depth;
        float face3 = height * depth;

        return 2*(face1 + face2 + face3);
    }
}
