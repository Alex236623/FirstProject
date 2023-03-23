package project.gui;

import project.domain.MySqlConnection;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static project.gui.Run.jFrame;

public class LoginFrom {
    private JPanel Login;
    private JTextField loginTextField;
    private JTextField passwordTextField;
    private JButton loginButton;
    private JButton signUp;

    PreparedStatement pst;
    MySqlConnection connection = new MySqlConnection();
    Connection con;

    public JPanel getMain() {
        return Login;
    }

    public LoginFrom() {

        loginButton.addActionListener(e -> {
            String login = loginTextField.getText();
            ResultSet rs;
            con = connection.connection();
            try {
                pst = con.prepareStatement("SELECT * FROM `user` WHERE `login` =?");
                pst.setString(1, login);
                rs = pst.executeQuery();

                System.out.println(rs.next());
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        });


        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getMain().setVisible(false);
                jFrame.setTitle("Sign Up Form");
                jFrame.setContentPane(new SignUp().getSignUp());
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                jFrame.pack();
                jFrame.setVisible(true);

            }
        });
    }

    public boolean checkUsername(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT * FROM `user` WHERE `login` =?";

        try {
            ps = connection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                checkUser = true;
                System.out.println("login +");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrom.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }

}

