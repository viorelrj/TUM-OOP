package com.labs.lab2.task1;

public class Task1 {
    public static void main() {
        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(1, 2, 3);

        box1.printInfo();
        box2.printInfo();
        box3.printInfo();

        System.out.println(box1.getSurfaceArea());
        System.out.println(box1.getVolume());
    }
}
