package com.labs.lab7;

import java.util.ArrayList;

public class Main {
    public static void bootstrap() {
        ArrayList<GeometricBody> geometricBodies = new ArrayList();
        geometricBodies.add(new Cube(3));
        geometricBodies.add(new Sphere(30));
        geometricBodies.add(new Parallelepiped(12, 15, 33));

        System.out.println(GeometricBodyController.getMaxSurfaceBody(geometricBodies).getSurface());
    }
}
