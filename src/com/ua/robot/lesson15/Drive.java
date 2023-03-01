package com.ua.robot.lesson15;

public interface Drive {
    default void drive() {
        System.out.print("Drive");
    }
}
