package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by employee on 11/16/16.
 */
public class JdbcConnector {
    private Connection connection;
    private String user = "root";
    private String pass= "school24";
    private String url="jdbc:mysql://localhost:3306/TaskDao";

    void conn(String url,String pass,String user) throws SQLException, ClassNotFoundException {


    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
