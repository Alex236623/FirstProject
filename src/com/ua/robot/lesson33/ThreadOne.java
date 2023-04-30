package com.ua.robot.lesson33;

import java.util.Random;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        int a = random.nextInt(1, 10);

        do {
            System.out.println(a);
            a = random.nextInt(1, 10);
        } while (a != 5);
    }
}