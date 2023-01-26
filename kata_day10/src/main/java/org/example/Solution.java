package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution{


    public static boolean canComplete(String letter,String word){
        String regex = "[a-z]*";
        StringBuilder matcherString = new StringBuilder(regex);

        for(String s: letter.split("")){
            matcherString.append(s);
            matcherString.append(regex);
        }


        return word.matches(matcherString.toString());
    }
}
