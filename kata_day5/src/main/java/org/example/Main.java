package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("password -> "+Solution.checkPassword("password"));
        System.out.println("11081992 -> " +Solution.checkPassword("11081992"));
        System.out.println("@S3cur1ty -> "+Solution.checkPassword("@S3cur1ty"));
        System.out.println("!@!pass1 -> "+Solution.checkPassword("!@!pass1"));
        System.out.println("mySecurePass123 -> "+Solution.checkPassword("mySecurePass123"));
        System.out.println("pass word -> "+Solution.checkPassword("pass word"));
        System.out.println("stonk -> "+Solution.checkPassword("stonk"));
    }
}