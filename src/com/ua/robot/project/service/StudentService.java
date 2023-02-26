package com.ua.robot.project.service;

import com.ua.robot.project.domain.Student;
import com.ua.robot.project.repository.StudentRepository;

import java.util.Arrays;

public class StudentService {
    private static final String TABLE_FORMAT = "│ %-5s │ %-25s │ %-30s │ %-10s │ %-88s│";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\033[0m";
    private final StudentRepository studentsRepository;

    public StudentService() {
        studentsRepository = new StudentRepository();
    }

    public void printStudents() {
        printHeader();
        for (Student student : studentsRepository.findAll()) {
            if (student != null) {
                String body = String.format(TABLE_FORMAT,
                        student.getId(),
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge(),
                        Arrays.toString(printGradesWithNotification(student.getGrades())));
                System.out.println(body);
            }
        }
    }

    private void printHeader() {
        printUpperDivider();
        System.out.printf((TABLE_FORMAT) + "%n", "ID", "First Name", "Last Name", "Age", "Grades");
        printLoverDivider();
    }

    private void printUpperDivider() {
        System.out.print("┌");
        for (int i = 1; i < getMegaLength(); i++) {
            System.out.print("─");
        }
        System.out.print("┐");
        System.out.println();
    }

    private void printLoverDivider() {
        System.out.print("└");
        for (int i = 1; i < getMegaLength(); i++) {
            System.out.print("─");
        }
        System.out.print("┘");
        System.out.println();
    }

    private StringBuilder[] printGradesWithNotification(int[] array) {
        StringBuilder[] result = new StringBuilder[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 4) {
                result[i] = new StringBuilder(RED + array[i] + RESET);
            } else if (array[i] > 4) {
                result[i] = new StringBuilder(GREEN + array[i] + RESET);
            }
        }
        return result;
    }

    public int getMegaLength() {
        Student student = new Student();
        int res;
        res = student.toString().length() + 104;
        return res;
    }
}
