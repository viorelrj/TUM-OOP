package com.labs.lab5;

public class E extends D {
    private String e;

    public E(String a, X x, String b, String c, String d, String e) {
        super(a, x, b, c, d);
        this.e = e;
    }

    void printSelf() {
        super.printSelf();
        System.out.println(e);
    }
}
