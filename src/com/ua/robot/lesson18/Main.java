package com.ua.robot.lesson18;


import com.ua.robot.project.old.service.Print;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        //Створити програму для збереження списку чисел з 10 елементів та іншого з 2 000 000 елементів. Для кожного підібрати свій тип

        //ArrayList test 50k operation time dor 20 elements
        Random random = new Random();
        long time = System.currentTimeMillis();
        List<Integer> twentyIntArrayList = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            for (int j = 0; j < 20; j++) {
                twentyIntArrayList.add(random.nextInt(1, 100));
            }
        }
        System.out.println(System.currentTimeMillis() - time + " time in ArrayList added");

        //LinkedList test 50k operation time dor 20 elements
        long time2 = System.currentTimeMillis();
        List<Integer> twentyIntLinkedList = new LinkedList<>();
        for (int i = 0; i < 50000; i++) {
            for (int j = 0; j < 20; j++) {
                twentyIntLinkedList.add(random.nextInt(1, 100));
            }
        }
        System.out.println(System.currentTimeMillis() - time2 + " time in LinkedList added");
        //Result 35 mils for ArrayList vs 97 mils LinkedList

        //ArrayList test 10 operation time dor 2mil elements
        long time3 = System.currentTimeMillis();
        List<Integer> twoMilIntArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2000000; j++) {
                twoMilIntArrayList.add(random.nextInt(1, 100));
            }
        }
        System.out.println(System.currentTimeMillis() - time3 + " time in ArrayList added 2mil");

        //LinkedList test 10 operation time dor 20 elements
        long time4 = System.currentTimeMillis();
        List<Integer> twoMilIntLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 2000000; j++) {
                twoMilIntLinkedList.add(random.nextInt(1, 100));
            }
        }
        System.out.println(System.currentTimeMillis() - time4 + " time in LinkedList added 2mil");
        //Result 573 mils for ArrayList vs 1895 mils LinkedList
        //* it seems result for arrayList is faster any way... *//


        //Зберегти у колекції список студентів (класс Студент теж створити)
        List<Student> students = new ArrayList<>();

        Random r = new Random();
        for (int i = 0; i < r.nextInt(1, 100); i++) {
            Student student = StudentRepository.getRandomStudent();
            students.add(student);

        }
        //Вивести цей список
        int[] tableSize = {5, 25, 30, 10, 80};
        String[] tableNames = {"ID", "First Name", "Last Name", "Age", "Grades"};
        Print.printHeader(tableSize, tableNames);
        for (Student student1 : students) {
            String body = String.format(Print.format(tableSize),
                    student1.getId(),
                    student1.getFirstName(),
                    student1.getLastName(),
                    student1.getAge(),
                    Arrays.toString(student1.getGrades()));
            System.out.println(body);
        }
        Print.printLoverDivider(tableSize);
/*
       // Опціонально: написати реалізацію класу ArrayList або LinkedList

        MyList<Integer> integerList=  new MyArrayListWithMyList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);

        System.out.println(integerList);
        */
    }
}
