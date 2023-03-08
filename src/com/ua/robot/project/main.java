package com.ua.robot.project;

import com.ua.robot.project.service.StudentService;
import com.ua.robot.project.service.TeacherService;


public class main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printStudents();
        studentService.printStudentsGrades();


        TeacherService teacherService = new TeacherService();
        teacherService.printTeachers();
    }
}
