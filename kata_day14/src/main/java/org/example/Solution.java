package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static String[] removeLetters(String[] letters, String word) {
        // Create a List to store filtered letters
        List<String> lettersArrayFiltered = new ArrayList<>(Arrays.asList(letters));

        // Iterate over all letters
        for (int i = 0; i < letters.length; i++) {
            // Check if the word contains the current letter
            if (word.contains(letters[i])) {
                // Remove the current letter from the filtered list
                lettersArrayFiltered.remove(letters[i]);
                // Replace the first occurrence of the current letter in the word with an empty string
                word = word.replaceFirst(letters[i], "");
            }
        }
        // Convert the filtered letters List to an array and return it
        return lettersArrayFiltered.toArray(new String[0]);
    }
}
