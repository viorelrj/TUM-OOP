package com.labs.lab5;

public class A {
    protected String a = "a from A";
    protected X x = new X("Uhhh, x from A");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    void printSelf() {
        System.out.println(a);
    }
}
