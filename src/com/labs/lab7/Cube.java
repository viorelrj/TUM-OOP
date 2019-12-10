package com.labs.lab7;

public class Cube extends GeometricBody {
    double sideLength;

    @Override
    double getSurface() {
        return (Math.pow(sideLength, 2) * 6);
    }

    @Override
    double getVolume() {
        return Math.pow(sideLength, 3);
    }
}
