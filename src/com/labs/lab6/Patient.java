package com.labs.lab6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Patient extends Person {
    String id;
    Hospital[] hospitals;
    OperationsStaff[] operationsStaff;

    public Patient(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone) {
        super(title, givenName, middleName, familyName, birthDate, gender, phone);
    }

    public int getAge() {
        Period age = Period.between(birthDate, LocalDate.now());
        return age.getYears();
    }
}
