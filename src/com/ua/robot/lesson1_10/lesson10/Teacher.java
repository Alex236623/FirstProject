package com.ua.robot.lesson1_10.lesson10;


import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class Teacher {

    private String name;
    private String profession;

    private int age;
    private int skillToTeach;

    public Teacher() {
    }

    public Teacher(String name, String profession, int age, int skillToTeach) {
        this.name = name;
        this.profession = profession;
        this.age = age;
        this.skillToTeach = skillToTeach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSkillToTeach() {
        return skillToTeach;
    }

    public void setSkillToTeach(int skillToTeach) {
        this.skillToTeach = skillToTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", year=" + age +
                ", skillToTeach=" + skillToTeach +
                '}';
    }

    public static void main(String[] args) {

    }

    public void teach(Student student) {
        if (getAge() > 35) {
            setSkillToTeach(getSkillToTeach() + 50);
        }
        if (student.getAge() < 7) {
            System.out.println("Student " + student.getName() + " is not ready for education");
        } else if (!Objects.equals(getProfession(), "IT Teacher")) {
            System.out.println("This teacher " + getName() + " cant teach IT");
        } else {
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    student.setSkill(student.getSkill() + getSkillToTeach());
                    System.out.println("From now \033[0;31m" + student.getName() + "\033[0m skill level is:" + student.getSkill());


                }
            }, 0, 5000);
        }
        System.out.println("Teacher \033[0;31m" + getName() + "\033[0m teach \033[0;31m" + student.getName() + "\033[0m");
    }

}
