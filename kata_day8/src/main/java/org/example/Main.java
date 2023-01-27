package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println( Solution.sumDigProd(0));
        System.out.println( Solution.sumDigProd(9));
        System.out.println( Solution.sumDigProd(9, 8));
        System.out.println( Solution.sumDigProd(16, 28));
        System.out.println( Solution.sumDigProd(111111111));
        System.out.println( Solution.sumDigProd(1, 2, 3, 4, 5, 6));
        System.out.println( Solution.sumDigProd(8, 16, 89, 3));
        System.out.println( Solution.sumDigProd(26, 497, 62, 841));
        System.out.println( Solution.sumDigProd(17737, 98723, 2));
        System.out.println( Solution.sumDigProd(123, -99));
        System.out.println( Solution.sumDigProd(167, 167, 167, 167, 167, 3));
        System.out.println( Solution.sumDigProd(98526, 54, 863, 156489, 45, 6156));
    }
}