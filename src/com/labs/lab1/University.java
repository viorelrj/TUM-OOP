package com.labs.lab1;

import java.util.*;

public class University {
    String name;
    int foundationYear;
    private ArrayList<Student> students = new ArrayList<>();

    private static ArrayList<University> instances = new ArrayList<>();

    public University (String _name, int _foundationYear) {
        name = _name;
        foundationYear = _foundationYear;

        instances.add(this);
    }

    public void addStudent(Student item) {
        students.add(item);
    }

    public static float getCrossUniversityAverageMedia() {
        float result = 0;

        for (University university: instances) {
            result += university.getAverageMedia();
        }

        return result / (instances.size());
    }

    public float getAverageMedia() {
        float result = 0;
        for (Student student: students) {
            result += student.mark;
        }

        return result / (students.size());
    }
}
