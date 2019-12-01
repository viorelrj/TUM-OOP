package com.labs.lab5;

public class D extends C {
    protected String d;
    protected X x = new X("Uhhhhh, this is a x from D");

    public D(String a, X x, String b, String c, String d) {
        super(a, x, b, c);
        this.d = d;
    }

    void printSelf() {
        super.printSelf();
        System.out.println(d);
    }
}
