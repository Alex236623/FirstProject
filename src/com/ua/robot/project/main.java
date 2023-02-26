package com.ua.robot.project;

import com.ua.robot.project.service.StudentService;

public class main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printStudents();
    }
}
