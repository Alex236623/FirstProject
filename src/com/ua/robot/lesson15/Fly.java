package com.ua.robot.lesson15;

public interface Fly {
    default void fly() {
        System.out.print("i can fly");
    }
}
