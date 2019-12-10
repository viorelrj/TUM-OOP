package com.labs.lab7;

public class Cube implements GeometricBody {
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    double sideLength;

    public double getSurface() {
        return (Math.pow(sideLength, 2) * 6);
    }

    public double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
