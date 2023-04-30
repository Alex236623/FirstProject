package com.ua.robot.lesson31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAssistant {


    static void fileCheckCreate(String file) {

        try {
            Path path = Path.of(file);
            if (path.toFile().createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void saveString(String file, String string) {

        try {
            Path path = Path.of(file);

            var result = Files.readString(path);
            Files.writeString(path, result + "\n" + string);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void loadData(String file) {
        try {
            Path path = Path.of(file);
            var result = Files.readAllLines(path);
            for (String res : result) {
                System.out.println(res);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}