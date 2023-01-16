package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        int[] numbers = { 2, 3, 1, 7, 9, 5, 11, 3, 5};

        findBiggestDiff(numbers);
        System.out.println();
        findPossibleSumOfTarget(numbers,10);



        double endTime = System.currentTimeMillis();
        System.out.println("runtime: "+(endTime-startTime)+"ms");
    }

    public static void findPossibleSumOfTarget(int[] numbers, int target){
        ArrayList<String> results = new ArrayList<>();

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<i;j++){
                if(numbers[j]+numbers[i] == target){
                    results.add(target + " = " + numbers[j] +"("+j+") + " + numbers[i]+"("+i+")");
                    System.out.println(target + " = " + numbers[j] +"("+j+") + " + numbers[i]+"("+i+")");
                }
            }
        }



    }

    public static void findBiggestDiff(int[] numbers){

        Integer delta1 = null;
        Integer delta2 = null;
        Integer delta1Index = null;
        Integer delta2Index = null;
        Integer currentDiff = 0;

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                if(numbers[j]-numbers[i] > currentDiff){
                    delta1 = numbers[i];
                    delta1Index = i;
                    delta2 = numbers[j];
                    delta2Index = j;
                    currentDiff = numbers[j]-numbers[i];
                }
            }
        }


        System.out.println(currentDiff + " = " + delta2 +"("+delta2Index +") - " + delta1+"("+delta1Index+")");
    }
}