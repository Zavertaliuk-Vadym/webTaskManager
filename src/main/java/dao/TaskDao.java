package dao;

import model.Task;
import model.ListName;

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

    public List<Task> getAllTasks() throws SQLException {
        List<Task> taskList = new ArrayList<>();
        String sql = "SELECT * FROM `table`";
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            taskList.add(new Task(rs.getInt("id")
                    , rs.getString("title")
                    , rs.getString("details")
                    , rs.getBoolean("view")
                    , rs.getString("localTime")
                    , rs.getString("currentDay")
                    ,rs.getInt("list_id")));
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
//        String sql = "SELECT `table`.id,title, details,view,`localTime`,currentDay,list.name FROM `table`,list WHERE list_id = list.id AND `table`.id LIKE1";
        //SELECT title, details,view,`localTime`,currentDay,list.name FROM `table`,list WHERE list_id = list.id AND `table`.id LIKE '4'
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            taskList.add(new Task(rs.getInt("id")
                    , rs.getString("title")
                    , rs.getString("details")
                    , rs.getBoolean("view")
                    , rs.getString("localTime")
                    , rs.getString("currentDay")
                    ,rs.getInt("list_id")));
        }
        conn.close();
        return taskList;
    }

    public void addTask(String title, String details, String localDate, String currentTime,int task) throws SQLException {
        String sql = "INSERT INTO `table`(title, details, `localTime`, currentDay,list_id) VALUES ('" + title + "','" + details + "','" + localDate + "','" + currentTime + "','" + task +"');";
        stmt.execute(sql);
                conn.close();
    }


}