package com.ua.robot.lesson18.test;

import java.util.Arrays;

public class IntArrayList implements IntList {

    int[] arr = {};

    @Override
    public int[] add(int element) {
        int[] arr2 = arr;
        arr = new int[arr.length + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr2[i];
        }
        arr[arr.length - 1] = element;
        return arr;
    }

    @Override
    public int[] remove(int index) {
        int count = 0;
        int count2 = 0;
        int[] arr2 = arr;
        for (int arrEl : arr) {
            count++;
            if (index == arrEl) {
                count2++;
                arr[count - 1] = 0;
            }
        }
        arr = new int[arr.length - count2];
        int count3 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                arr[count3] = arr2[i];
                count3++;
            }
        }
        return arr;
    }

    @Override
    public int[] remove(int[] object) {
        for (int element : object) {
            remove(element);
        }
        return arr;
    }

    @Override
    public void clear() {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }


    }

    @Override
    public int get(int index) {
        return arr[index - 1];
    }

    @Override
    public int[] set(int index, int element) {
        arr[index] = element;
        return arr;
    }

    @Override
    public int[] add(int index, int element) {
        int[] arr2 = arr;
        arr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            arr[i] = arr2[i];
        }
        arr[index] = element;
        for (int i = index; i < arr.length - 1; i++) {
            arr[i + 1] = arr2[i];
        }

        return arr;
    }


    @Override
    public String toString() {
        return "IntArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
