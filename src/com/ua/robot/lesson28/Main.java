package com.ua.robot.lesson28;

import java.util.Scanner;

import static com.ua.robot.lesson28.FileAssistant.*;


public class Main {
    static final String FILE = "example.txt";

    public static void main(String[] args) {
        fileCheckCreate(FILE);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something to save in " + FILE + ":");
        saveString(FILE, scanner.nextLine());
        loadData(FILE);
    }
}
