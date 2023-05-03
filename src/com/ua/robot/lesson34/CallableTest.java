package com.ua.robot.lesson34;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTest implements Callable<Integer> {
    @Override
    public Integer call() {
        return new Random().nextInt(1, 50);
    }
}