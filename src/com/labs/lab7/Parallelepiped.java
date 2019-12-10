package com.labs.lab7;

public class Parallelepiped extends GeometricBody{
    public Parallelepiped(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double x;
    double y;
    double z;


    @Override
    double getVolume() {
        return x * y * z;
    }

    @Override
    double getSurface() {
        return 2 * (x*y + x*z + y*z);
    }
}
