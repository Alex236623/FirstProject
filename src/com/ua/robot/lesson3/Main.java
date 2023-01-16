package com.ua.robot.lesson3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter first number:");
        float fromInput1 = scanner1.nextInt();

        Scanner operation = new Scanner(System.in);
        System.out.print("Choose operation you want to make press 1 for plus, 2 for minus, 3 for /, and 4 for * ");
        float fromOperationInput = operation.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter second number:");
        float fromInput2 = scanner2.nextInt();

        if (fromOperationInput == 1) {
            System.out.println("Your result: " + (fromInput1 + fromInput2));
        }
        if (fromOperationInput == 2) {
            System.out.println("Your result: " + (fromInput1 - fromInput2));
        }
        if (fromOperationInput == 3 && fromInput1 != 0 && fromInput2 != 0) {
            System.out.println("Your result: " + (fromInput1 / fromInput2));

        } else System.out.println("Sorry 0 is unexceptionable");
        if (fromOperationInput == 4) {
            System.out.println("Your result: " + (fromInput1 * fromInput2));
        }

    }
}