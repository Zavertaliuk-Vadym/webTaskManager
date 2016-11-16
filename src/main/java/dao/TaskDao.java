package dao;

import model.Task;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/16/16.
 */
public class TaskDao {
    private Connection conn = null;
    private Statement stmt = null;


    public TaskDao() throws SQLException, ClassNotFoundException {
        conn = new JdbcConnector().getConn();
        stmt = conn.createStatement();
        System.out.println("Connecting to database...");
    }

    public List<Task> getAll() throws SQLException {
        List<Task> taskList = new ArrayList<>();
        String sql = "SELECT * FROM `table`";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println("!!!"+rs.getString("id"));
            taskList.add(new Task(rs.getInt("id")
                    ,rs.getString("title")
                    ,rs.getString("details")
                    ,rs.getBoolean("view")
                    ,rs.getString("localTime")));
        }
        conn.close();
        return taskList;
    }

//    public List<Task> getTaskFromId() throws SQLException {
//        List<Task> taskList = new ArrayList<>();
//        String sql = "SELECT * FROM new_table where id =";
//        ResultSet rs = stmt.executeQuery(sql);
//        while(rs.next()){
//            taskList.add(new Task(rs.getInt("id")
//                    ,rs.getString("title")
//                    ,rs.getString("details")
//                    ,rs.getBoolean("view")
//                    ,rs.getString("localTime")));
//        }
//        conn.close();
//        return taskList;
//    }


}
