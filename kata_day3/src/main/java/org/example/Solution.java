package org.example;

public class Solution {

    /**
     * converts sting to camelCase by looping through input string while it still contains some underscore.
     * Then removes the underscore and replace the proceeding letter with an uppercase version of itself.
     * @param input the string to convert.
     * @return the converted string.
     */
    public static String toCamelCase(String input){
        StringBuilder result = new StringBuilder(input);
        while(result.indexOf("_") != -1){
            int firstUnderscore = result.indexOf("_");
            //By using +2 it replaces both the underscore and makes the next letter uppercase.
            result.replace(firstUnderscore,firstUnderscore+2, String.valueOf(result.charAt(firstUnderscore+1)).toUpperCase());
        }

        return result.toString();
    }

    /**
     * Converts String to snakeCase by looping through the entire string and converting any uppercase letters to
     * a lowercase letter, and adding a preceding underscore.
     * @param input String to convert.
     * @return converted String.
     */
    public static String toSnakeCase(String input){
        StringBuilder result = new StringBuilder(input);

        for(int i=0;i<input.length();i++){
            Character currentChar = input.charAt(i);
            if(Character.isUpperCase(currentChar)){
                result.replace(i,i+1,"_"+String.valueOf(currentChar).toLowerCase());
            }
        }
        return result.toString();
    }
}
