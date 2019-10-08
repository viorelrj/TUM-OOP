package com.labs.lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TextHelper {
    private static String vowelRegex = "aouiey";

    private static String getSquashedBy(String input, String item) {
        return input.replaceAll("(" + item + ")+", item);
    }

    private static int countStickedOccurences(String input, Character val) {
        int counter = 0;

        input = input.strip();

        for (int i = 1; i < input.length(); i++)  {
            if (input.charAt(i) == val && input.charAt(i - 1) != val) counter++;
        }

        return counter;
    }

    public static int countSentences(String input) {
        String sanitizedInput = getSquashedBy(input, ".");
        return countStickedOccurences(sanitizedInput, '.');
    }

    public static int countWords(String input) {
        String sanitizedInput = getSquashedBy(input, " ");
        return countStickedOccurences(input, ' ');
    }

    public static int countLetters(String input) {
        String letters = input.replaceAll("[^a-zA-Z]","");
        return letters.length();
    }

    public static int countVowels(String input) {
        String vowels = input.toLowerCase().replaceAll("[^" + vowelRegex + "]", "");
        return vowels.length();
    }

    public static int countConsonants(String input) {
        String letters = input.toLowerCase().replaceAll("[^a-zA-Z]", "");
        return letters.replaceAll("[" + vowelRegex + "]", "").length();
    }

    private static HashMap<String, Integer> getWordHashMap(String input) {
        input = input.toLowerCase().replaceAll("[^a-z\\s]", "");
        input = getSquashedBy(input, " ");

        int wordBegin = 0;
        int wordEnd = 0;
        String word = null;

        HashMap<String, Integer> wordHashMap = new HashMap<String, Integer>();

        while(wordBegin < input.length() - 1) {
            wordEnd = wordBegin;

            while(wordEnd < input.length() - 1 && input.charAt(wordEnd) != ' ') {
                wordEnd++;
            }

            if (wordBegin != wordEnd && wordBegin < input.length()) {
                word = input.substring(wordBegin, wordEnd);
            }

            if(wordHashMap.containsKey(word)) {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word, 1);
            }

            wordBegin = wordEnd + 1;
        }

        return wordHashMap;
    }

    public static String getLongestWord(String input) {
        HashMap<String, Integer> wordHashMap = getWordHashMap(input);

        Integer maxLength = 0;
        String maxKey = null;

        String key = null;

        for (HashMap.Entry<String, Integer> entry : wordHashMap.entrySet()) {
            key = entry.getKey();

            if (key.length() > maxLength) {
                maxLength = key.length();
                maxKey = key;
            }
        }

        return maxKey;
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
