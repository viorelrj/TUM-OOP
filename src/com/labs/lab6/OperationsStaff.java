package com.labs.lab6;

import java.time.LocalDate;
import java.util.Date;

public abstract class OperationsStaff extends Staff {
    Patient[] patients;

    public OperationsStaff(String title, String givenName, String middleName, String familyName, LocalDate birthDate, Gender gender, Phone phone, Date joined, String[] education, String[] certification, String[] languages) {
        super(title, givenName, middleName, familyName, birthDate, gender, phone, joined, education, certification, languages);
    }
}
