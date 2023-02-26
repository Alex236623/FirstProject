package com.ua.robot.lesson14;

public abstract class Human {
    int age;
    String firstName;
    String lastName;

    public Human(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void introduction();
}
