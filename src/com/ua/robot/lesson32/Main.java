package com.ua.robot.lesson32;

public class Main {
    public static void main(String[] args) {

        ThreadOne to = new ThreadOne();
        ThreadTwo tt = new ThreadTwo();

        to.start();
        tt.start();
    }
}
