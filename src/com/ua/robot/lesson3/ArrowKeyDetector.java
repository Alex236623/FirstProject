package com.ua.robot.lesson3;


import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeyDetector {

    public ArrowKeyDetector() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();

        panel.add(up);
        panel.add(down);
        panel.add(right);
        panel.add(left);

        up.setText("Up: 0");
        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");

        frame.addKeyListener(new KeyListener() {
            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode) {
                    case KeyEvent.VK_UP -> up.setText("Up" + upCount++);
                    case KeyEvent.VK_DOWN -> down.setText("Down" + downCount++);
                    case KeyEvent.VK_LEFT -> left.setText("Left" + leftCount++);
                    case KeyEvent.VK_RIGHT -> right.setText("Right" + rightCount++);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);

    }

    public static void main(String[] args) {
       new ArrowKeyDetector();
    }
}
