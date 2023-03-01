package com.ua.robot.lesson15;

public class Pilot extends Human {
    @Override
    public void drive() {
        super.drive();
        System.out.println(" a plane");
    }

    @Override
    public void fly() {
        super.fly();
    }
}
