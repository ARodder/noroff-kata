package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV",
            "I" };

    // This method converts an integer to its Roman numeral representation
    public static final String integerToRoman(int number) {
        // Get the index of the largest Roman numeral that is less than or equal to the
        // input number
        int i = getFloorIndex(number);
        // If the input number is equal to the value of the Roman numeral at that index
        if (number == values[i]) {
            // return the Roman numeral at that index
            return romanLiterals[i];
        }
        // Else, return the Roman numeral at that index concatenated with the result of
        // recursively calling this method with the input number minus the value of the
        // Roman numeral at that index
        return romanLiterals[i] + integerToRoman(number - values[i]);
    }

    // A helper method to find the largest Roman numeral that is less than or equal
    // to the input number
    private static int getFloorIndex(int number) {
        
        // Loop through the values array
        for (int i = 0; i < values.length; i++) {
            // if the value of the Roman numeral at the current index is less than or equal
            // to the input number
            if (number >= values[i]) {
                // return the index
                return i;
            }
        }
        // if no suitable index is found, return -1
        return -1;
    }

    public static int romanToInt(String romanNumeral){
        HashMap<String, Integer> romanNumerals = new HashMap<String, Integer>();
        romanNumerals.put("M", 1000);
        romanNumerals.put("D", 500);
        romanNumerals.put("C", 100);
        romanNumerals.put("L", 50);
        romanNumerals.put("X", 10);
        romanNumerals.put("V", 5);
        romanNumerals.put("I", 1);
        List<Integer> numbers = new ArrayList<>();
        int number = 0;
        String[] numerals = romanNumeral.split("");

        for(String character: numerals){
            numbers.add(romanNumerals.get(character));
        }

        for(int i=0;i<numbers.size();i++){
            if(i+1== numbers.size()){
                number += numbers.get(i); 
                break;
            }
            if(numbers.get(i) >=numbers.get(i+1)){
                number += numbers.get(i);
            }else{
                number -= numbers.get(i);
            }
        }


        return number;
    }
}
