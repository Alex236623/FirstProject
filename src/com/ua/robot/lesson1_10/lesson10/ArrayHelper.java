package com.ua.robot.lesson1_10.lesson10;



import java.util.Random;

public class ArrayHelper {

    private int[] array;
    private int numberQuantity;
    private int minMeaning;
    private int maxMeaning;


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.numberQuantity = array.length;
        this.minMeaning = arrayMinValue(array);
        this.maxMeaning = arrayMaxValue(array);
        this.array = array;
    }


    public ArrayHelper() {
    }

    public ArrayHelper(int[] array) {
        this.array = array;
    }

    public ArrayHelper( int numberQuantity, int minMeaning, int maxMeaning) {
        createArray(numberQuantity,minMeaning,maxMeaning);
        this.numberQuantity = numberQuantity;
        this.minMeaning = minMeaning;
        this.maxMeaning = maxMeaning;
    }

    public void createArray(int numberQuantity, int minMeaning, int maxMeaning) {

        int[] array = new int[numberQuantity];
        Random random = new Random();
        for (int i = 0; i < numberQuantity; i++) {
            array[i] = random.nextInt(minMeaning, maxMeaning + 1);
        }
        setArray(array);
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


    public void sortFromMin() {
        int[] array = getArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp;
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void sortFromMax() {
        int[] array = getArray();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int tmp;
                if (array[i] < array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void println() {
        System.out.println(toString(getArray()));
    }

    private static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    @Override
    public String toString() {
        return "ArrayHelper{" +
                "array=" + toString(array) +
                ", numberQuantity=" + numberQuantity +
                ", minMeaning=" + minMeaning +
                ", maxMeaning=" + maxMeaning +
                '}';
    }
}
