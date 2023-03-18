package com.ua.robot.lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int i = 0; i < 1000; i++) {
            hashSet.add(random.nextInt(0, 50));
            treeSet.add(random.nextInt(0, 50));
            linkedHashSet.add(random.nextInt(0, 50));
        }

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);
    }
}