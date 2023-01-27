package org.example;

public class Solution {
    

// This method calculates the sum of the digits of the product of the input integers
public static int sumDigProd(int... numbers){
    // Initialize a variable to store the final result
    int result = 0;
    // Loop through all input integers
    for(int number:numbers){
        // Add each input integer to the result
        result +=number;
    }

    // Keep looping until the result is a single digit number
    while(result > 10){
        // Convert the result to a string and split it into an array of individual digits
        String[] digits = (result+"").split("");
        // Reset the result to 1
        result = 1;
        // Loop through the array of digits
        for(String digit:digits){
            // Multiply the result by each digit
            result = result * Integer.parseInt(digit);
        }
    }
    // Print the final result
    System.out.println(result);
    // Return the final result
    return result;
}
    
}
