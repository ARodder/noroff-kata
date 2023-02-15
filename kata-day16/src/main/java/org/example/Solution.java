package org.example;

import java.util.*;

public class Solution {
    private static Map<Character,String> translation = new HashMap<>();

    public static String textToNum(String input){
        fillMap();
        StringBuilder result = new StringBuilder();
        for(Character letter : input.toCharArray()){
            if(translation.containsKey(letter)){
                result.append(translation.get(letter));
            }else{
                result.append(letter);
            }
        }
        return result.toString();
    }

    private static void fillMap(){
        translation.put('A',"2");
        translation.put('B',"2");
        translation.put('C',"2");
        translation.put('D',"3");
        translation.put('E',"3");
        translation.put('F',"3");
        translation.put('G',"4");
        translation.put('H',"4");
        translation.put('I',"4");
        translation.put('J',"5");
        translation.put('K',"5");
        translation.put('L',"5");
        translation.put('M',"6");
        translation.put('N',"6");
        translation.put('O',"6");
        translation.put('P',"7");
        translation.put('Q',"7");
        translation.put('R',"7");
        translation.put('S',"7");
        translation.put('T',"8");
        translation.put('U',"8");
        translation.put('V',"8");
        translation.put('W',"9");
        translation.put('X',"9");
        translation.put('Y',"9");
        translation.put('Z',"9");


    }
}
