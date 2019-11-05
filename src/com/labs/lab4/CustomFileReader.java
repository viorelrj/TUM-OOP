package com.labs.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomFileReader {
    public static ArrayList<String> readFile(String src) {
        ArrayList<String> results = new ArrayList<>();
        File file = new File(src);


        try {
            Scanner s = new Scanner(file);

            while (s.hasNext()) {
                results.add(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return results;
    }

}
