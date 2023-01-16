package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.nextLine());
        System.out.println(sc.nextInt());
        sc.nextLine();
        System.out.println(sc.nextLine());

        for(int i =1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            if (i%3 == 0){
                System.out.println("Fizz");
            }
            if (i%5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}