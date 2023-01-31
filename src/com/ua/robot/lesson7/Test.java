package com.ua.robot.lesson7;

public class Test {


    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        int d = 16;
        int c = 3;
        System.out.println(stringFactorialNumber(a));
        System.out.println(stringFactorialNumber(a, b));
        System.out.println(stringFactorialNumber(d, c));
    }

    /**
     * This is a JavaDoc public method comment
     */
    public static StringBuilder stringFactorialNumber(int a) {

        return stringFactorialNumber(a, 1);
    }

    /**
     * this method provides you to see string of factorial until number of the first param
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
}
