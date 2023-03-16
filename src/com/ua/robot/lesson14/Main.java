package com.ua.robot.lesson14;

import com.ua.robot.project.old.repository.StringGenerator;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Human teacher = new Teacher(random.nextInt(1, 100), StringGenerator.generateName(), StringGenerator.generateLastName());
        Human student = new Student(random.nextInt(1, 100), StringGenerator.generateName(), StringGenerator.generateLastName());

        teacher.introduction();
        student.introduction();
    }
}
