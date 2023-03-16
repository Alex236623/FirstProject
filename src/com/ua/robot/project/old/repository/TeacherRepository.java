package com.ua.robot.project.old.repository;

import com.ua.robot.project.old.domain.Teacher;

import java.util.Random;

import static com.ua.robot.project.old.repository.StringGenerator.generateLastName;
import static com.ua.robot.project.old.repository.StringGenerator.generateName;

public class TeacherRepository {
    public static final int SIZE = 3;
    private final Teacher[] teachers = new Teacher[SIZE];

    public void save(Teacher teacher) {
        for (int i = 0; i < SIZE; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    public TeacherRepository() {
        fillArrayYWithRandomTeacher();
    }

    public Teacher[] findAll() {
        return teachers;
    }


    private void fillArrayYWithRandomTeacher() {
        for (int i = 0; i < 10; i++) {
            Teacher teachers = getRandomTeacher();
            teachers.setId(i);
            save(teachers);
        }
    }

    private static Teacher getRandomTeacher() {
        Random random = new Random();
        String firstName = generateName();
        String lastName = generateLastName();
        int age = random.nextInt(15, 40);

        return new Teacher(0, firstName, lastName, age);
    }
}
