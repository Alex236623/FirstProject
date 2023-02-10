package com.ua.robot.lesson10;

public class Student {
    private String name;
    private int age;
    private int skill;
    public Student() {
    }
    public Student(String name, int age, int skill) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSkill() {
        return skill;
    }
    public void setSkill(int skill) {
        this.skill = skill;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", year=" + age +
                ", skillToTeach=" + skill +
                '}';
    }




}
