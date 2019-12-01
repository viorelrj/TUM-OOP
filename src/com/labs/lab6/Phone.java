package com.labs.lab6;

public class Phone {
    private String countryCode;
    private String id;

    public Phone(String countryCode, String id) {
        this.countryCode = countryCode;
        this.id = id;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber () {
        return countryCode + id;
    }
}
