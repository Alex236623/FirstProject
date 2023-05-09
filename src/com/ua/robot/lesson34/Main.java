package com.ua.robot.lesson34;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<CallableTest> l1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            l1.add(new CallableTest());
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futuresInt = executorService.invokeAll(l1);
        for (Future<Integer> res : futuresInt) {
            System.out.println(res.get());
        }
        executorService.close();
    }
}