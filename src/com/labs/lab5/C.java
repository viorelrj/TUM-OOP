package com.labs.lab5;

public class C extends B {
    protected String c;

    public C(String a, X x, String b, String c) {
        super(a, x, b);
        this.c = c;
    }

    void printSelf() {
        super.printSelf();
        System.out.println(c);
    }
}
