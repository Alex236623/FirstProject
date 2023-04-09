package com.ua.robot.lesson25;

import java.util.Scanner;

//Запросити з консолі число і огорнути цей функціонал у блоки обробки винятків.
//
//При вводі замість числа  буков - показувати повідомлення про помилку на консоль.
//
// За допомогою нескінченного циклу - запитувати число з консолі - поки не отримаємо його без помилок
public class Main {
    public static void main(String[] args) {

        getIFromConsole();


    }

    public static void getIFromConsole() {

        int i = 25;
        Scanner getInt = new Scanner(System.in);
        System.out.println("Enter number " + i + " : ");
        try {
            if (getInt.nextInt() == i) {

                System.out.println("U have complete task, good job!");
                System.exit(0);
            }else {
                System.out.println("It is wrong number! ENTER "+i +" its simple!");
            }
        } catch (Exception e) {
            System.out.println("It is not a number!");
        } finally {
            getIFromConsole();
        }

    }
}
