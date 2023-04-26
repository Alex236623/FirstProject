package com.ua.robot.lesson32;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " Thread name:" + ThreadOne.currentThread().getName());
        }
    }
}