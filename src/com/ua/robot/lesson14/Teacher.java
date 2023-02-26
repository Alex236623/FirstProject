package com.ua.robot.lesson14;

public class Teacher extends Human {
    public Teacher(int age, String firstName, String lastName) {
        super(age, firstName, lastName);
    }

    @Override
    public void introduction() {
        int age = super.age;
        String firstName = super.firstName;
        String lastName = super.lastName;
        System.out.println("Hello, i am " + lastName + " " + firstName + " i am " + age + " years old,i am teacher");
    }
}
