package com.ua.robot.lesson9;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;

public class GhostSimulator {
    public static final String RESET = "\033[0m";
    public static final String RED = "\033[0;31m";

    public static void main(String[] args) {
        Ghost();
        simulationClearConsole();


    }

    static void Ghost() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            Timer t = new Timer();
            t.schedule(new TimerTask() {
                public void run() {
                    Robot r = null;
                    try {
                        r = new Robot();
                    } catch (AWTException ignored) {


                    }
                    assert r != null;
                    r.keyPress(KeyEvent.VK_WINDOWS);


                    r.keyRelease(KeyEvent.VK_WINDOWS);


                }
            }, 0, 6000);
            t.schedule(new TimerTask() {
                public void run() {
                    Robot r = null;
                    try {
                        r = new Robot();
                    } catch (AWTException ignored) {


                    }
                    assert r != null;
                    r.keyPress(KeyEvent.VK_H);
                    r.keyRelease(KeyEvent.VK_H);
                    r.keyPress(KeyEvent.VK_E);
                    r.keyRelease(KeyEvent.VK_E);
                    r.keyPress(KeyEvent.VK_L);
                    r.keyRelease(KeyEvent.VK_L);
                    r.keyPress(KeyEvent.VK_L);
                    r.keyRelease(KeyEvent.VK_L);
                    r.keyPress(KeyEvent.VK_O);
                    r.keyRelease(KeyEvent.VK_O);
                    r.keyPress(KeyEvent.VK_SPACE);
                    r.keyRelease(KeyEvent.VK_SPACE);
                    r.keyPress(KeyEvent.VK_W);
                    r.keyRelease(KeyEvent.VK_W);
                    r.keyPress(KeyEvent.VK_O);
                    r.keyRelease(KeyEvent.VK_O);
                    r.keyPress(KeyEvent.VK_R);
                    r.keyRelease(KeyEvent.VK_R);
                    r.keyPress(KeyEvent.VK_L);
                    r.keyRelease(KeyEvent.VK_L);
                    r.keyPress(KeyEvent.VK_D);
                    r.keyRelease(KeyEvent.VK_D);


                }
            }, 0, 10000);
            int ascii = br.read();
            simulationClearConsole();
            System.out.println(ascii);
            System.out.print("\r" + RED + "ASCII Value - " + ascii + "\r" + RESET);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void simulationClearConsole() {
        for (int i = 0; i < 50; ++i) System.out.println();

    }


}