package com.ua.robot.project.old;

import com.ua.robot.project.old.service.StudentService;
import com.ua.robot.project.old.service.TeacherService;


public class main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.printStudents();
        studentService.printStudentsGrades();


        TeacherService teacherService = new TeacherService();
        teacherService.printTeachers();
    }
}
