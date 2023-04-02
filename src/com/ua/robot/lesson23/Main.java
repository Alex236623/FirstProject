package com.ua.robot.lesson23;

import java.util.*;


public class Main {

    //1. Створити лист з 20 прізвищами. Вони повинні повторюватися.
    //За допомогою стрім апі перетворити цей лист на мапу.
    //У якості ключа повинно бути прізвище, а я якості значення кількість повторень його.

    public static void main(String[] args) {


        List<String> l1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            l1.add("Ivanov");
        }
        for (int i = 0; i < 4; i++) {
            l1.add("Codecov");
        }
        for (int i = 0; i < 6; i++) {
            l1.add("Voles");
        }
        for (int i = 0; i < 7; i++) {
            l1.add("Grooms");
        }

        Map<String, Integer> l2 = new HashMap<>();
        l1.stream()
                .distinct()
                .toList()
                .forEach(it -> l2.put(it, Collections.frequency(l1, it)));

        System.out.println(l2);

        //2. Заповнити лист випадковими числами. Знайти суму цих чисел за допомогою Stream API
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            integerList.add(random.nextInt(1, 10));
        }
        int sum = integerList.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}