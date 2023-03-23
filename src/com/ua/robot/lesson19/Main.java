package com.ua.robot.lesson19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        ArrayList<Integer> thousandItems = new ArrayList<>(1000);
        thousandItems.add(random.nextInt(1, 50));

        long time = System.currentTimeMillis();
        for (int j = 0; j < 10000; j++) {

            for (int i = 0; i < 10000; i++) {
                hashSet.add(random.nextInt(0, 50));
                treeSet.add(random.nextInt(0, 50));
                linkedHashSet.add(random.nextInt(0, 50));
            }
            j++;
        }
        System.out.println(System.currentTimeMillis() - time + " time in FOR I ");

        long time2 = System.currentTimeMillis();
        for (int j = 0; j < 24000000; j++) {
            for (int item : thousandItems) {
                hashSet.add(item);
                treeSet.add(item);
                linkedHashSet.add(item);

            }
            j++;
        }


        System.out.println(System.currentTimeMillis() - time2 + " time in FOREACH ");

        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linkedHashSet);
    }
}