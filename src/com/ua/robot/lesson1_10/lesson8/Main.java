package com.ua.robot.lesson1_10.lesson8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int arrayLength = 10;
        int min = 1;
        int max = 10;

        int[] myArray = randomIntArrayCreator(arrayLength, min, max);

        System.out.println("\n my array is:" + Arrays.toString(myArray));
        System.out.println("\n min value of array " + arrayMinValue(myArray));
        System.out.println("\n max value of array " + arrayMaxValue(myArray));
        System.out.println("\n average value of the array " + averageValue(myArray));
        System.out.println("\n array sum " + arraySum(myArray));
        System.out.println("\n array multiples " + multipliesArray(myArray));
    }

    static int[] randomIntArrayCreator(int numberQuantity, int minMeaning, int maxMeaning) {
        int[] array = new int[numberQuantity];
        Random random = new Random();
        for (int i = 0; i < numberQuantity; i++) {
            array[i] = random.nextInt(minMeaning, maxMeaning + 1);// it seems second args is 'until'(until that number), so I use +1 to fix it XD
        }
        return array;
    }

    static int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    static int arrayMinValue(int[] array) {
        int minValue = array[0];
        for (int i : array) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    static int arrayMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i : array) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }

    static int multipliesArray(int[] array) {
        int result = 1;
        for (int j : array) {
            result *= j;
        }
        return result;
    }

    static double averageValue(int[] array) {
        int multiplicationResult = 1;
        for (int i : array) {
            multiplicationResult += i;
        }
        double result = multiplicationResult;
        double arrayLength = array.length;
        return result / arrayLength;
    }


}