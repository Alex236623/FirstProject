package com.ua.robot.project.old.service;

public class Print {
    public static void printHeader(int[] size, String[] names) {
        printUpperDivider(size);
        format(size);
        System.out.printf((format(size)) + "%n", (Object[]) names);
        printMidDivider(size);
    }

    public static String format(int[] size) {
        String tableFormat = "";
        for (int length : size) {
            tableFormat = "%s│%%-%ds".formatted(tableFormat, length);
        }
        tableFormat += "│";
        return tableFormat;
    }

    public static void printUpperDivider(int[] size) {
        System.out.print("┌");
        int count = size.length;
        for (int length : size) {
            count--;
            for (int i = 1; i < length + 1; i++) {
                System.out.print("─");
            }
            if (count != 0) {
                System.out.print("┬");
            } else {
                System.out.print("┐");
            }
        }
        System.out.println();
    }

    public static void printMidDivider(int[] size) {
        System.out.print("├");
        int count = size.length;
        for (int length : size) {
            count--;
            for (int i = 1; i < length + 1; i++) {
                System.out.print("─");
            }
            if (count != 0) {
                System.out.print("┼");
            } else {
                System.out.print("┤");
            }
        }
        System.out.println();
    }

    public static void printLoverDivider(int[] size) {
        System.out.print("└");
        int count = size.length;
        for (int length : size) {
            count--;
            for (int i = 1; i < length + 1; i++) {
                System.out.print("─");
            }
            if (count != 0) {
                System.out.print("┴");
            } else {
                System.out.print("┘");
            }
        }
        System.out.println();
    }
}
