package dao;

import model.Task;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
        while (rs.next()) {
            taskList.add(new Task(rs.getInt("id")
                    , rs.getString("title")
                    , rs.getString("details")
                    , rs.getBoolean("view")
                    , rs.getString("localTime")
                    , rs.getString("currentDay")));
        }
        conn.close();
        return taskList;
    }

    public void setView(String id) throws SQLException {
        String sql = "UPDATE `table` SET view = !view WHERE id=" + id;
        stmt.execute(sql);
        conn.close();
    }

    public void delete(String id) throws SQLException {
        String sql = "DELETE FROM `table`WHERE id =" + id;
        stmt.execute(sql);
        conn.close();
    }

    public List<Task> viewDescription(String id) throws SQLException {
        List<Task> taskList = new ArrayList<>();
        String sql = "SELECT * FROM `table` WHERE id=" + id;
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            taskList.add(new Task(rs.getInt("id")
                    , rs.getString("title")
                    , rs.getString("details")
                    , rs.getBoolean("view")
                    , rs.getString("localTime")
                    , rs.getString("currentDay")));
        }
        conn.close();
        return taskList;
    }

    public void addTask(String title, String details, String localDate, String currentTime) throws SQLException {
        String sql = "INSERT INTO `table`(title, details, `localTime`, currentDay) VALUES ('" + title + "','" + details + "','" + localDate + "','" + currentTime + "');";
        stmt.execute(sql);
        conn.close();
    }

}