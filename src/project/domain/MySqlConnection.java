package project.domain;

import project.Settings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection extends Settings {
    public Connection connection;

    public Connection connection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(MY_SQL_CONNECTION_ROOT, MY_SQL_LOGIN, MY_SQL_PASSWORD);
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        }
        return connection;
    }



    public Connection getConnection() {
        return connection;
    }
}
