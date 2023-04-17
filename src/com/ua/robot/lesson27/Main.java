package com.ua.robot.lesson27;

import java.util.Scanner;

import static com.ua.robot.lesson27.FileAssistant.*;

//Створити класс з 2 функціями.
//Перша зберігає отриману строку у файл.
//Друга - зчитує дані з файлу та повертає його користувачу.
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
