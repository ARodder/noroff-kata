package org.example;

public class Main {
    public static void main(String[] args) {


        for (String letter : Solution.removeLetters(new String[]{"s", "t", "r", "i", "n", "g", "w"}, "string")) {
            System.out.print(letter+",");
        }
        System.out.println();

        for (String letter : Solution.removeLetters(new String[]{"b", "b", "l", "l", "g", "n", "o", "a", "w"}, "balloon")) {
            System.out.print(letter+",");
        }
        System.out.println();
        for (String letter : Solution.removeLetters(new String[]{"a", "n", "r", "y", "o", "w"}, "norway")) {
            System.out.print(letter+",");
        }
        System.out.println();

        for (String letter : Solution.removeLetters(new String[]{"t", "t", "e", "s", "t", "u"}, "testing")) {
            System.out.print(letter+",");
        }
    }
}