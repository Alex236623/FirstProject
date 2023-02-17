package com.ua.robot.lesson1_10.lesson9;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class RobotTest {
    public static void main(String[] args) {
        robot();
    }
    static void robot()
    {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run(){
                Robot r = null;
                try {
                    r = new Robot();
                } catch (AWTException ignored) {
                }
                assert r != null;
                r.keyPress( KeyEvent.VK_SHIFT);
                r.keyRelease( KeyEvent.VK_WINDOWS);
            }
        }, 0, 1);

    }
}
