package com.labs.lab5;

public class J extends I {
    protected String j;

    public J(String a, X x, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        super(a, x, b, c, d, e, f, g, h, i);
        this.j = j;
    }

    void printSelf() {
        printSelfX();
        super.printSelf();
        System.out.println(j);
    }
}
