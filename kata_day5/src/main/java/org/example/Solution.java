package org.example;

public class Solution {

    public static String checkPassword(String password){
        int criteriaMatch = 0;
        if(password.contains(" ") || password.length()<=6)return "invalid";

        if (password.matches("^.*[A-Z].*$"))criteriaMatch++;

        if (password.matches("^.*[a-z].*$"))criteriaMatch++;

        if (password.matches("^.*[0-9].*$"))criteriaMatch++;

        if (password.matches("^.*[@#$%^&+=].*$"))criteriaMatch++;

        if(password.length()>=8)criteriaMatch++;

        if (criteriaMatch==5)return "Strong";
        else if(criteriaMatch>=3)return "Moderate";
        else return "Weak";

    }
}
