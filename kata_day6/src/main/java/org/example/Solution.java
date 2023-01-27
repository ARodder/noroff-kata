package org.example;

public class Solution {
    private static final String[] oneToNineteen = new String[]{"zero","one","two","three","four","five","six",
            "seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static final String[] tens = new String[] {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    private static final String hundred = "hundred";

    public static String numToEng(int num){
        if(num < 0 || num > 999)return"invalid input";
        String result = "";

        if(num<20){
            result = oneToNineteen[num];
        } else if(num < 100){
            result = buildTwoDigitNumber(num);
        }else{
            result = buildThreeDigitNumber(num);
        }


        return result;
    }

    private static String buildTwoDigitNumber(int num){
        String result = "";
        String[] number = String.valueOf(num).split("");

        result += tens[Integer.parseInt(number[0])-1];
        result += " ";
        result += oneToNineteen[Integer.parseInt(number[1])];

        return result;
    }

    private static String buildThreeDigitNumber(int num){
        String result = "";
        String[] number = String.valueOf(num).split("");

        result += oneToNineteen[Integer.parseInt(number[0])];
        result += " ";
        result += hundred;
        result += " ";
        if(Integer.parseInt(number[1]) <= 1){
            result += oneToNineteen[Integer.parseInt(number[1]+number[2])];
        }else{
            result += buildTwoDigitNumber(Integer.parseInt(number[1]+number[2]));
        }


        return result;
    }


}
