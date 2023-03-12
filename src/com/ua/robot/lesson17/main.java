package com.ua.robot.lesson17;

public class main {


    public static void main(String[] args) {

        // class realization
        Week week = new Week();
        week.weekDay(1);
        week.weekDay(5);

        // enum realization
        DaysOfWeek[] week2 = DaysOfWeek.values();
        for (DaysOfWeek daysOfWeek : week2) {
            System.out.println(daysOfWeek);
        }
        int numberOfWeek = 1;
        System.out.println(week2[numberOfWeek - 1]);


    }
}
