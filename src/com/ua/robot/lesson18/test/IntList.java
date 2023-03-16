package com.ua.robot.lesson18.test;

public interface IntList {
    int[] add(int element);

    int[] remove(int[] object);

    void clear();

    int get(int index);

    int[] set(int index, int element);

    int[] add(int index, int element);

    int[] remove(int index);
}
