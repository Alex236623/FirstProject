package project.gui;


import project.domain.MySqlConnection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Objects;

import static project.gui.Run.jFrame;

public class SignUp {
    private JPanel SignUp;
    private JButton signUpButton;
    private JTextField login;
    private JTextField password;
    private JTextField passwordConfirm;
    private JTextField firstName;
    private JTextField lastName;
    private JButton backToLoginButton;
    PreparedStatement pst;
    MySqlConnection connection = new MySqlConnection();
    Connection con;

    public SignUp() {
        backToLoginButton.addActionListener(e -> {
            jFrame.setTitle("Login Form");
            jFrame.setContentPane(new LoginFrom().getMain());
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.pack();
            jFrame.setVisible(true);
            jFrame.setLocationRelativeTo(null);

        });
        signUpButton.addActionListener(e -> {
            String loginText = login.getText();
            String passwordText = password.getText();
            String passwordConfirmText = passwordConfirm.getText();
            String firstNameText = firstName.getText();
            String lastNameText = lastName.getText();
            if (Objects.equals(passwordText, passwordConfirmText)) {
                try {
                    con = connection.connection();
                    pst = con.prepareStatement("insert into user(`id`, `login`, `password`, `role`, `firstName`, `lastName`)values(?,?,?,?,?,?)");
                    pst.setString(1, null);
                    pst.setString(2, loginText);
                    pst.setString(3, passwordText);
                    pst.setString(4, String.valueOf(Role.USER));
                    pst.setString(5, firstNameText);
                    pst.setString(6, lastNameText);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Sign Up Confirmed");
                    backToLoginButton.doClick();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            } else JOptionPane.showMessageDialog(null, "Please Check your Password");

        });
    }

    public JPanel getSignUp() {
        return SignUp;
    }
}
