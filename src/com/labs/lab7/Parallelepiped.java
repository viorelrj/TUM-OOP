package com.labs.lab7;

public class Parallelepiped implements GeometricBody{
    public Parallelepiped(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double x;
    double y;
    double z;



    public double getVolume() {
        return x * y * z;
    }

    public double getSurface() {
        return 2 * (x*y + x*z + y*z);
    }
}
