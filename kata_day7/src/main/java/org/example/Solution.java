package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Solution {
    //Creates array with all the vowels in english
    private static ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u' }));

    public static String translateWord(String word) {
        String result = "";
        //Initiates a pattern to check for punctuation
        Pattern p = Pattern.compile("\\p{Punct}");
        //if the word has no letter just return an empty string.
        if(word.length() == 0)return "";

        //Checks if the first letter is a vowel
        if (!vowels.contains(Character.toLowerCase(word.charAt(0)))) {
            int i = 1;
            for (i = 1; i < word.length(); i++) {
                if (vowels.contains(word.charAt(i))) {
                    break;
                }
            }

            //Checks for punctuation
            if (p.matcher(word.substring(word.length() - 1)).find()) {
                result += word.substring(i, word.length() - 1);
                result += word.substring(0, i);
                result += "ay";
                result += word.substring(word.length() - 1);
            } else {
                result += word.substring(i, word.length());
                result += word.substring(0, i);
                result += "ay";
            }

        } else {
            //Checks for punctuation
            if (p.matcher(word.substring(word.length() - 1)).find()) {
                result = word.substring(0,word.length()-1) + "yay"+word.charAt(word.length()-1);
            } else {
                result = word + "yay";
            }
            
        }

        return result;
    }

    public static String translateSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(translateWord(word) + " ");
        }
        result.delete(result.length()-1, result.length());

        return result.toString();
    }

}
