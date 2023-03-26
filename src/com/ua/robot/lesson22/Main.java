package com.ua.robot.lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Створити клас студент з полями Прізвище та Середній бал. Написати два компаратори для сортування по цим полям.
//У головному класі наповнити лист даними про студентів та відсортувати за допомогою цих компараторів.
//Показати на консоль 3 варіанти листа: оригінальний та 2 відсортованих
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", new int[]{77, 25, 79, 21, 23}));
        students.add(new Student("Artem", new int[]{12, 16, 6, 2, 3}));
        students.add(new Student("Anna", new int[]{99, 89, 95, 87, 98}));
        System.out.println("Оригінал                 :" + students);

        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Сорт по імені            :" + students);

        students.sort(Comparator.comparing(Student::getMidGrade));
        System.out.println("Сорт по середній оцінці  :" + students);

    }
}