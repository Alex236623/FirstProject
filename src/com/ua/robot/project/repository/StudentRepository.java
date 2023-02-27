package com.ua.robot.project.repository;

import com.ua.robot.project.domain.Student;

import java.util.Random;

import static com.ua.robot.project.repository.StringGenerator.generateLastName;
import static com.ua.robot.project.repository.StringGenerator.generateName;

public class StudentRepository {
    public static final int SIZE = 10;
    private final Student[] students = new Student[SIZE];

    public void save(Student student) {
        for (int i = 0; i < SIZE; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    public StudentRepository() {
        fillArrayYWithRandomStudents();
    }

    public Student[] findAll() {
        return students;
    }

    private void fillArrayYWithRandomStudents() {
        for (int i = 0; i < 10; i++) {
            Student students = getRandomStudent();
            students.setId(i);
            save(students);
        }
    }

    private static Student getRandomStudent() {
        Random random = new Random();
        String firstName = generateName();
        String lastName = generateLastName();
        int age = random.nextInt(15, 40);
        int[] grades = new int[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(1, 12); // генеруємо випадкове число від 0 до 100
        }
        return new Student(0, firstName, lastName, age, grades);
    }
}
