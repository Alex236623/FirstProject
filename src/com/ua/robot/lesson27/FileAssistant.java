package com.ua.robot.lesson27;

import java.io.*;

import static com.ua.robot.lesson27.Main.FILE;

public class FileAssistant {


    static void fileCheckCreate(String file) {
        try {
            File f = new File(file);
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void saveString(String file, String string) {
        try (OutputStream outputStream = new FileOutputStream(file);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream)) {
            outputStreamWriter.write(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void loadData(String file) {
        try (InputStream inputStream = new FileInputStream(file); InputStreamReader inputStreamReader = new InputStreamReader(inputStream)) {
            byte[] data = inputStream.readAllBytes();
            String dataString = new String(data);
            System.out.println(dataString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}