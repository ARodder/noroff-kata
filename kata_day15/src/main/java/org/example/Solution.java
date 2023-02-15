package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    // This method validates the given full name and returns a boolean value indicating whether it is a valid name or not.
    public static boolean validName(String fullName){
        // Split the full name by spaces and store each name in an ArrayList
        List<String> names = new ArrayList<>(Arrays.asList(fullName.split(" ")));
        // If there's only one name, return false
        if(names.size() <= 1 || names.size() > 3) return false;
        // If there are three names and the first name has only two characters and the second name has more than two characters, return false
        if(names.size() == 3 && names.get(0).length() == 2 && names.get(1).length()>2) return false;
        // If the last name has less than two characters, return false
        if(names.get(names.size()-1).length() <= 2) return false;
        // Loop through each name and check for validity
        for(String name: names){
            // If a name has only one character, return false
            if(name.length() == 1) return false;
            // If a name doesn't start with an uppercase letter, return false
            if(!Character.isUpperCase(name.charAt(0))) return false;
            // If a name has more than two characters and ends with a period, return false
            if(name.length() > 2 && name.charAt(name.length()-1) == '.') return false;
            // If a name has two characters, but the first character is not an uppercase letter and the second character is not a period, return false
            if(name.length() == 2 && !Character.isUpperCase(name.charAt(0)) && name.charAt(1) != '.') return false;
        }
        // Return true if all checks pass
        return true;
    }
}
