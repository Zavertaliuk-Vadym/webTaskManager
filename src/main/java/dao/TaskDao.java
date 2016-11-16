package dao;

import model.Task;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/16/16.
 */
public class TaskDao {
    private String user = "root";
    private String pass= "school24";
    private String url="jdbc:mysql://localhost:3306/TaskDao";
    private Connection conn = null;
    private Statement stmt = null;


    public TaskDao() throws SQLException, ClassNotFoundException {
        conn = DriverManager.getConnection(url,user,pass);
        stmt = conn.createStatement();
        System.out.println("Connecting to database...");
    }

    public List<Task> getAll() throws SQLException {
        List<Task> taskList = new ArrayList<>();
        String sql = "SELECT * FROM new_task";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            taskList.add(new Task(rs.getString("taskId"),rs.getString("title"),rs.getString("details"),rs.getString("view")));
        }
        conn.close();
        return taskList;
    }

}
