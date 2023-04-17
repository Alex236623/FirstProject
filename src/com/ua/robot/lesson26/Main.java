package com.ua.robot.lesson26;

import java.util.Scanner;

//Створити виняток який викидається коли число менше нуля.
//Створити функцію, яка приймає число і повертає його квадрат.
//Якщо число буде менше нуля - то викинути створений вийняток.
public class Main {
    public static void main(String[] args) {
        try {
            getIntFromConsole();
        } catch (lessThanZeroException e) {
            e.printStackTrace();
        }
        try {
            squareInt();
        } catch (lessThanZeroException zeroException) {
            System.out.println("My goodness how u do it?");
            zeroException.printStackTrace();
        }
    }

    static void getIntFromConsole() throws lessThanZeroException {
        Scanner getFirstInt = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = getFirstInt.nextInt();
        checkLessThanZero(a);
    }

    static void checkLessThanZero(int i) throws lessThanZeroException {
        if (i < 0) {
            throw new lessThanZeroException();
        }
        System.out.println(i);
    }

    static void squareInt() throws lessThanZeroException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get it squared");
        int scRes = sc.nextInt();
        int squareRes = scRes * scRes;
        checkLessThanZero(squareRes);
    }
}