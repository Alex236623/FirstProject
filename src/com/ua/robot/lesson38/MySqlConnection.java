package com.ua.robot.lesson38;

import java.sql.*;

public class MySqlConnection {
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private String SqlRoot = "jdbc:mysql://localhost/test";
    private String SqlLogin = "root";
    private String SqlPassword = "";
    private Connection conn = null;
    private Statement stmt = null;

    public MySqlConnection() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void open() {
        try {
            conn = DriverManager.getConnection(SqlRoot, SqlLogin, SqlPassword);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void close() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void findOne(String query) {
        try {
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            System.out.print(rs.getString(1));
            System.out.print(rs.getString(2));
            System.out.print(rs.getString(3));
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void findAll(String query) {
        try {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(rs.getString(2));
                System.out.print(rs.getString(3));
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insert(String query) {
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(query);
            pst.executeQuery();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}