package com.ua.robot.lesson15;

public class Main {
    public static void main(String[] args) {

        Drive driver = new Driver();
        Fly pilot = new Pilot();
        driver.drive();
        pilot.fly();
        System.out.println();

        Human driver2 = new Driver();
        Human pilot2 = new Pilot();
        driver2.drive();
        pilot2.drive();
        pilot2.fly();
    }


}
