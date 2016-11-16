package controller;

import dao.TaskDao;
import model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

@WebServlet({"/newTask"})
public class NewTaskServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            TaskDao taskDao = new TaskDao();
            taskDao.addTask(req.getParameter("new_task"), req.getParameter("new_description"), new Date(System.currentTimeMillis()).toString());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/home");
    }
}
