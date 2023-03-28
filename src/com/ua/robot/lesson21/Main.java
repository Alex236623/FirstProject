package com.ua.robot.lesson21;

import java.time.Instant;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Instant i = Instant.now();
        System.out.println(i);
        LocalDate localDate = LocalDate.now();
        localDate.lengthOfMonth();
    }
}
