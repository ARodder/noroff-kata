package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.price(new Integer[] {}));

        System.out.println(assert_equal(0.0, Solution.price(new Integer[] {})));
        System.out.println(assert_equal(8.0, Solution.price(new Integer[] { 1 })));
        System.out.println(assert_equal(8.0, Solution.price(new Integer[] { 2 })));
        System.out.println(assert_equal(8.0, Solution.price(new Integer[] { 3 })));
        System.out.println(assert_equal(8.0 * 3.0, Solution.price(new Integer[] { 1, 1, 1 })));

        System.out.println(assert_equal(8 * 2 * 0.95, Solution.price(new Integer[] { 0, 1 })));
        System.out.println(assert_equal(8 * 3 * 0.9, Solution.price(new Integer[] { 0, 2, 3 })));
        System.out.println(assert_equal(8 * 4 * 0.8, Solution.price(new Integer[] { 0, 1, 2, 3 })));

        System.out.println(assert_equal(8 + (8 * 2 * 0.95), Solution.price(new Integer[] { 0, 0, 1 })));
        System.out.println(assert_equal(2 * (8 * 2 * 0.95), Solution.price(new Integer[] { 0, 0, 1, 1 })));
        System.out.println(assert_equal((8 * 4 * 0.8) + (8 * 2 * 0.95), Solution.price(new Integer[] { 0, 0, 1, 2, 2, 3 })));

    }

    public static boolean assert_equal(double a, double b) {
        return a == b;
    }
}