package project;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame("LoginForm");
        frame.setContentPane(new LoginFrom().getMain());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}
