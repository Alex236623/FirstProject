package project;

import project.domain.MySqlConnection;

import javax.swing.*;
import java.sql.*;

public class LoginFrom {
    private JPanel Main;
    private JTextField loginTextField;
    private JTextField passwordTextField;
    private JButton loginButton;

    PreparedStatement pst;
    MySqlConnection connection = new MySqlConnection();
    Connection con;

    public JPanel getMain() {
        return Main;
    }

    public LoginFrom() {
        loginButton.addActionListener(e -> {
            String name = loginTextField.getText();
            String password = passwordTextField.getText();
            try {
                con = connection.connection();

                pst = con.prepareStatement("insert into user(name,password,role)values(?,?,?)");
                pst.setString(1, name);
                pst.setString(2, password);
                pst.setString(3, "user");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "recordAdded");

                loginTextField.setText("");
                passwordTextField.setText("");
                loginTextField.requestFocus();

            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        });

    }

}

