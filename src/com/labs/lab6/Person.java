package com.labs.lab6;

import java.time.LocalDate;

enum Gender {
    male,
    female
}

public class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    LocalDate birthDate;
    Gender gender;

    public Person(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone = phone;
    }

    Phone phone;

    public String getFullName() {
        return givenName + " " + middleName + " " + familyName;
    }
}
