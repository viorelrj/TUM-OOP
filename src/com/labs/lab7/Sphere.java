package com.labs.lab7;

public class Sphere extends GeometricBody {
    double radius;

    @Override
    double getSurface() {
        return 4 * Math.PI * radius;
    }

    @Override
    double getVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }


}
