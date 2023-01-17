package com.ua.robot.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 10;
        while (counter > 0) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter first number:");
            float fromInput1 = scanner1.nextInt();

            Scanner operation = new Scanner(System.in);
            System.out.println("Choose operation you want to make press:");
            System.out.println("1- for operation +");
            System.out.println("2- for operation -");
            System.out.println("3- for operation /");
            System.out.println("4- for operation *");
            float fromOperationInput = operation.nextInt();

            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Enter second number:");
            float fromInput2 = scanner2.nextInt();

            if (fromOperationInput == 1) {
                System.out.println("Your result: " + (fromInput1 + fromInput2));
            }
            if (fromOperationInput == 2 && fromInput1 > 0 && fromInput2 > 0 || fromOperationInput == 2 && fromInput1 < 0 && fromInput2 > 0) {
                System.out.println("Your result: " + (fromInput1 - fromInput2));
            }
            if (fromOperationInput == 2 && fromInput1 < 0 && fromInput2 < 0) {
                System.out.println("Your result: " + (fromInput1 + fromInput2));
            }
            if (fromOperationInput == 3 && fromInput1 != 0 && fromInput2 != 0) {
                System.out.println("Your result: " + (fromInput1 / fromInput2));
            }
            if (fromOperationInput == 3 && fromInput1 == 0 || fromOperationInput == 3 && fromInput2 == 0) {
                System.out.println("Sorry 0 is unexceptionable");
            }
            if (fromOperationInput == 4) {
                System.out.println("Your result: " + (fromInput1 * fromInput2));
            }
            counter--;
        }
        System.out.println("Free version has been expired");
    }
}