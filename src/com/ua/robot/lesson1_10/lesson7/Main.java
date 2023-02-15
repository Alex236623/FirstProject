package com.ua.robot.lesson1_10.lesson7;


public class Main {
    public static void main(String[] args) {

        int a = 7;
        int b = 3;
        int c = 200;

        System.out.println(stringFactorialNumber(a));
        System.out.println(stringFactorialNumber(a, b));
        System.out.println(stringFactorialNumber(a, a));
        System.out.println(toCubedNumber(a));
        System.out.println(factorial(a));
        symbolPrintedTimesNumber(a);
        symbolPrintedTimesNumber(a, "$");
        System.out.println(fibonacciNumbersUntil(c));

    }

    static int toCubedNumber(int a) {
        return a * a * a;
    }

    static void symbolPrintedTimesNumber(int a) {
        symbolPrintedTimesNumber(a, "*");
    }

    static void symbolPrintedTimesNumber(int a, String symbol) {

        for (int i = 0; i < a; i++) {
            System.out.print(symbol);

        }
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1); // 3 * 2 * 1 * 1
        }
    }

    public static StringBuilder stringFactorialNumber(int a) {
        return stringFactorialNumber(a, 1);
    }

    /**
     * 1. this method provides you to see factorial of incoming number
     * 2. make both params same to see full plate of factorials
     * Q. How did the programmer die in the shower?
     * A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.
     *
     * @param a this is integer number of factorial you want to see
     * @param b How many factorials you want to see near exactly factorial
     */
    public static StringBuilder stringFactorialNumber(int a, int b) {
        StringBuilder result = new StringBuilder();
        if (a == b) {
            while (a != 0) {
                int j = a;
                for (int i = 1; i < a; i++) {
                    j = j * i;
                }
                result.append(j).append(" ");
                a--;
            }
        } else {
            int k = a - b;
            while (a != k) {
                int j = a;
                for (int i = 1; i < a; i++) {
                    j = j * i;
                }
                result.append(j).append(" ");
                a--;
            }
        }
        return result;
    }

    public static String fibonacciNumbersUntil(int a) {
        StringBuilder result = new StringBuilder();
        int b = 1;
        int c = 1;
        int d = 0;
        while (d < a) {
            d = b + c;
            b = c;
            c = d;
            result.append(b).append(" ");
        }
        return result.toString();
    }
}