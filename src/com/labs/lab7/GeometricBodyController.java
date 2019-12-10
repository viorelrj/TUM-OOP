package com.labs.lab7;

import java.util.ArrayList;

public class GeometricBodyController {

    public static GeometricBody getMaxVolumeBody(ArrayList<GeometricBody> geometricbodies) {
        GeometricBody max = geometricbodies.get(0);

        for (GeometricBody body: geometricbodies) {
            if (body.getVolume() > max.getVolume()) {
                max = body;
            }
        }

        return max;
    }

    public static GeometricBody getMaxSurfaceBody(ArrayList<GeometricBody> geometricbodies) {
        GeometricBody max = geometricbodies.get(0);

        for (GeometricBody body: geometricbodies) {
            if (body.getSurface() > max.getSurface()) {
                max = body;
            }
        }

        return max;
    }
}
