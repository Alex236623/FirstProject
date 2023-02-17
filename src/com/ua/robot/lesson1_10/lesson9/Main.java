package com.ua.robot.lesson1_10.lesson9;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 10;
        int[][] myArray = getTwoDimensionalArray(a, b, c);
        System.out.println(Arrays.deepToString(myArray));
        System.out.println(arrayMainDiagonalSum(myArray));
        System.out.println(arraySideDiagonalSum(myArray));

    }

    static int[][] getTwoDimensionalArray(int numberQuantity, int minMeaning, int maxMeaning) {
        int[][] array = new int[numberQuantity][numberQuantity];
        Random random = new Random();
        for (int i = 0; i < numberQuantity; i++) {
            for (int j = 0; j < numberQuantity; j++) {
                array[i][j] = random.nextInt(minMeaning, maxMeaning + 1);
            }
        }
        return array;
    }


    static int arrayMainDiagonalSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    static int arraySideDiagonalSum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][array.length - 1 - i];
            System.out.println(array[i][array.length - 1 - i]);
        }
        return sum;
    }
}
