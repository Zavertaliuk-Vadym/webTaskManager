package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by employee on 11/16/16.
 */
public class JdbcConnector {
    private String user = "root";
    private String pass = "school24";
    private String url = "jdbc:mysql://localhost:3306/Task";
    private Connection conn;

    JdbcConnector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }
}
