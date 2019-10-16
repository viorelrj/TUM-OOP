package com.labs.lab3;

import java.util.ArrayList;
import java.util.HashMap;

public class TextHelper {
    private static String vowelRegex = "aouiey";

    private static String eliminateRepeatingOccurencies(String input, String item) {
        return input.replaceAll("(" + item + ")+", item);
    }

    private static int countOccurences(String input, Character val) {
        int counter = 0;

        for (int i = 1; i < input.length(); i++)  {
            if (input.charAt(i) == val) counter++;
        }

        return counter;
    }

    private static int countStickedOccurences(String input, Character val) {
        int counter = 0;

        for (int i = 1; i < input.length(); i++)  {
            if (input.charAt(i) == val && input.charAt(i -1 ) != val) counter++;
        }

        return counter;
    }

    public static int countSentences(String input) {
        String lowerCase = input.toLowerCase();
        String sanitizedInput = lowerCase.replaceAll("[.?!]+", ".").replaceAll( "[!?]", ".");
        int flag = (lowerCase.replaceAll("[^a-z]", "").length() > 0)? 1 : 0;

        return Math.max(sanitizedInput.replaceAll("[^.]", "").length(), flag);
    }

    public static int countWords(String input) {
        String sanitizedInput = input.toLowerCase().replaceAll("[^a-z-']", " ").strip();
        sanitizedInput = eliminateRepeatingOccurencies(sanitizedInput, " ");

        return (sanitizedInput.length() > 0)? sanitizedInput.split("\\s").length : 0;
    }

    public static int countLetters(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-z]","");
        return letters.length();
    }

    public static int countVowels(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-z]", "");
        return letters.replaceAll("[^" + vowelRegex + "]", "").length();
    }

    public static int countConsonants(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-z]", "");
        return letters.replaceAll("[" + vowelRegex + "]", "").length();
    }

    private static HashMap<String, Integer> getWordHashMap(String input) {
        input = input.toLowerCase().replaceAll("[^a-z\\s]", "");
        input = eliminateRepeatingOccurencies(input, " ");

        HashMap<String, Integer> wordHashMap = new HashMap<String, Integer>();

        String[] words = input.split("\\s");

        for(String word: words) {
            if(wordHashMap.containsKey(word)) {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word, 1);
            }
        }

        return wordHashMap;
    }

    public static String getLongestWord(String input) {
        String sanitizedInput = input.toLowerCase().replaceAll("[^a-z-']", " ").strip();
        sanitizedInput = eliminateRepeatingOccurencies(sanitizedInput, " ");

        String words[] = sanitizedInput.split("\\s");

        String longestWord = "";

        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static ArrayList<String> getTopWords(String input, int count) {
        HashMap<String, Integer> wordHashMap = getWordHashMap(input);

        Integer maxVal = 0;
        String maxKey = null;

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < count; i++) {
            for (HashMap.Entry<String, Integer> entry : wordHashMap.entrySet()) {
                String key = entry.getKey();
                Integer val = entry.getValue();

                if (val > maxVal) {
                    maxVal = val;
                    maxKey = key;
                }
            }

            result.add(maxKey);
            wordHashMap.remove(maxKey);

            maxVal = 0;
            maxKey = null;
        }

        return result;
    }
}
