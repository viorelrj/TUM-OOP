package com.labs.lab6;

public class Address {
    private String country;
    private String city;
    private String street;
    private String building;
    private String appartment;

    public String getAddress() {
        return country + ", " + city + ", " + street + " " + building + ", " + "ap. " + appartment;
    }
}

