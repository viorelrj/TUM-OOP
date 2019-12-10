package com.labs.lab6;

import java.time.LocalDate;
import java.util.Date;

public abstract class Staff extends Person {
    Date joined;
    String[] education;
    String[] certification;
    String[] languages;

    public Staff(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone, Date joined, String[] education, String[] certification, String[] languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }
}
