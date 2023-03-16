package com.ua.robot.lesson18;


import com.ua.robot.lesson18.test.IntArrayList;

public class MainTest {

    public static void main(String[] args) {
        IntArrayList a = new IntArrayList();
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(0);
        a.add(2);
        a.add(6);
        a.add(0);
        a.set(2, 8);
        System.out.println(a);
        a.add(4, 9);
        System.out.println(a.get(2));
        System.out.println(a);
        a.remove(2);
        a.clear();

        System.out.println(a);

    }
}
