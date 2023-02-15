package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static boolean validateCard(Long cardNum) {

        // Convert card number to string and split into array of digits as strings
        String[] nativeDigitsArray = cardNum.toString().split("");

        // Convert array of strings to List of strings
        List<String> digitsAsString = new ArrayList<>(Arrays.asList(nativeDigitsArray));

        // Convert List of strings to List of integers
        List<Integer> digits = digitsAsString.stream().map(e -> Integer.parseInt(e)).collect(Collectors.toList());

        // Check if card number length is within 14-19 digits
        if (digits.size() < 14 || digits.size() > 19)
            return false;

        // Get the last digit as the check digit
        int checkDigit = digits.get(digits.size() - 1);

        // Remove the last digit from the list
        digits.remove(digits.size() - 1);

        // Reverse the order of the digits
        Collections.reverse(digits);

        // Perform Luhn algorithm on the digits
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (i % 2 == 0) {
                int newValue = digits.get(i) * 2;
                if (newValue >= 10) {
                    newValue = splitAndSum(newValue);
                }
                sum += newValue;
                digits.set(i, newValue);
            } else {
                sum += digits.get(i);
            }
        }

        // Calculate the expected check digit
        int calculatedDigit = 10 - Integer.parseInt((sum + "").split("")[1]);

        // Compare calculated check digit with actual check digit
        if (calculatedDigit != checkDigit)
            return false;

        // Return result of validation
        return true;
    }

    // Split a number into its digits and return the sum
    public static int splitAndSum(int number) {
        String[] digits = ("" + number).split("");

        return Integer.parseInt(digits[0]) + Integer.parseInt(digits[1]);
    }
}
