package project.gui;

import javax.swing.*;

public class Run {
    public static JFrame jFrame = new JFrame();

    public void run() {
        jFrame.setTitle("Login Form");
        jFrame.setContentPane(new LoginFrom().getMain());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
    }

}
