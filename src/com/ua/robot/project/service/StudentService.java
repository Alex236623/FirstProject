package com.ua.robot.project.service;

import com.ua.robot.project.domain.Student;
import com.ua.robot.project.repository.StudentRepository;


import java.util.Arrays;

public class StudentService  {


    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\033[0m";
    private final StudentRepository studentsRepository;


    public StudentService() {
        studentsRepository = new StudentRepository();
    }

    public void printStudents() {
        int[] tableSize = {5, 25, 30, 10, 80};
        String[] tableNames = {"ID", "First Name", "Last Name", "Age", "Grades"};
        Print.printHeader(tableSize, tableNames);
        for (Student student : studentsRepository.findAll()) {
            if (student != null) {
                String body = String.format(Print.format(tableSize),
                        student.getId(),
                        student.getFirstName(),
                        student.getLastName(),
                        student.getAge(),
                        Arrays.toString(student.getGrades()));
                System.out.println(body);
            }
        }
        Print.printLoverDivider(tableSize);
    }

    public void printStudentsGrades() {
        int[] gradesTableSize = {25, 30, 40};
        String[] gradesTableNames = {"First Name", "Last Name", "Grades"};
        Print.printHeader(gradesTableSize, gradesTableNames);
        for (Student student : studentsRepository.findAll()) {
            if (student != null) {
                String body = String.format(Print.format(gradesTableSize),
                        student.getFirstName(),
                        student.getLastName(),
                        printGradesWithNotification(student.getGrades()));
                System.out.println(body);
            }
        }
        Print.printLoverDivider(gradesTableSize);
    }


    private String printGradesWithNotification(int[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 9) {
                result[i] = RED + " " + array[i] + RESET;
            } else if ((array[i] > 9) && (array[i] <= 20)) {
                result[i] = RED + array[i] + RESET;
            } else {
                result[i] = GREEN + array[i] + RESET;
            }
        }
        return Arrays.toString(result);
    }


}
