package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.validName("H. Wells"));
        System.out.println(Solution.validName("H. G. Wells"));
        System.out.println(Solution.validName("Herbert G. Wells"));
        System.out.println(Solution.validName("Herbert"));
// Must be 2 or 3 words
        System.out.println(Solution.validName("h. Wells"));
// Incorrect capitalization
        System.out.println(Solution.validName("H Wells"));
// Missing dot after initial
        System.out.println(Solution.validName("H. George Wells"));
// Cannot have: initial first name + word middle name
        System.out.println(Solution.validName("H. George W."));
// Last name cannot be initial
        System.out.println(Solution.validName("Herb. George Wells"));
// Words cannot end with a dot (only initials can)
        System.out.println("Hello world!");
    }
}