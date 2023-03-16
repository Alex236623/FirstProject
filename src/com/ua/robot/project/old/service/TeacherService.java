package com.ua.robot.project.old.service;


import com.ua.robot.project.old.domain.Teacher;
import com.ua.robot.project.old.repository.TeacherRepository;

public class TeacherService{
    final int[] tableSize = {5, 25, 30, 10};
    final String[] tableNames = {"ID", "First Name", "Last Name", "Age"};


    private final TeacherRepository teacherRepository;


    public TeacherService() {
        teacherRepository = new TeacherRepository();
    }

    public void printTeachers() {
        Print.printHeader(tableSize, tableNames);
        for (Teacher teacher : teacherRepository.findAll()) {
            if (teacher != null) {
                String body = String.format(Print.format(tableSize),
                        teacher.getId(),
                        teacher.getFirstName(),
                        teacher.getLastName(),
                        teacher.getAge()
                );
                System.out.println(body);
            }
        }
        Print.printLoverDivider(tableSize);
    }


}
