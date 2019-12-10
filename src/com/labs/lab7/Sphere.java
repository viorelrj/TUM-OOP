package com.labs.lab7;

public class Sphere implements GeometricBody {
    public Sphere(double radius) {
        this.radius = radius;
    }

    double radius;

    public double getSurface() {
        return 4 * Math.PI * radius;
    }

    public double getVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}
