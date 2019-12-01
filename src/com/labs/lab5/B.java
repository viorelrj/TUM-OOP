package com.labs.lab5;

public class B extends A {
    protected String b;

    public B(String a, X x, String b) {
        super(a, x);
        this.b = b;
    }

    void printSelf() {
        super.printSelf();
        System.out.println(b);
    }
}
