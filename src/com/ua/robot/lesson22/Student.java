package com.ua.robot.lesson22;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class Student implements Comparable<Student> {
    String name;
    int[] grades;

    public double getMidGrade() {
        return Arrays.stream(this.grades).sum() / Arrays.stream(grades).count();
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Студент{" +
                "Ім'я ='" + name + '\'' +
                ", Оцінки=" + Arrays.toString(grades) +
                ", Середня оцінка =" + getMidGrade() +
                '}';
    }
}