package com.ua.robot.lesson31;


import static com.ua.robot.lesson31.FileAssistant.*;

public class Main {
    public static  void main(String[] args) {

        final String FILE_FOR_FIELDS = "simple.txt";
        final String FILE_FOR_PUBLIC_FIELDS = "public.txt";
        final String FILE_FOR_PRIVATE_FIELDS = "private.txt";
        final String FILE_FOR_PROTECTED_FIELDS = "public.txt";

        fileCheckCreate(FILE_FOR_FIELDS);
        fileCheckCreate(FILE_FOR_PUBLIC_FIELDS);
        fileCheckCreate(FILE_FOR_PRIVATE_FIELDS);
        fileCheckCreate(FILE_FOR_PROTECTED_FIELDS);

        var result = TestObject.class.getDeclaredFields();


        for (var res : result) {

            switch (res.getModifiers()) {
                case 1:
                    saveString(FILE_FOR_PUBLIC_FIELDS,res.getName());
                    break;
                case 2:
                    saveString(FILE_FOR_PRIVATE_FIELDS,res.getName());
                    break;
                case 4:
                    saveString(FILE_FOR_PROTECTED_FIELDS,res.getName());
                    break;
                case 0:
                    saveString(FILE_FOR_FIELDS,res.getName());
                    break;
                default:
                    throw new RuntimeException();
            }


        }
    }
}
