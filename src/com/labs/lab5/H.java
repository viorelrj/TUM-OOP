package com.labs.lab5;

public class H extends G {
    protected String h;
    private X x = new X("This is a Shelby's X, from H");

    public H(String a, X x, String b, String c, String d, String e, String f, String g, String h) {
        super(a, x, b, c, d, e, f, g);
        this.h = h;
    }

    void printSelfX() {
        x.printSelf();
    }

    void printSelf() {
        super.printSelf();
        x.printSelf();
        System.out.println(h);
    }
}
