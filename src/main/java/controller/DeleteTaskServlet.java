package controller;

import dao.TaskDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet({"/delete"})
public class DeleteTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            TaskDao taskDao = new TaskDao();
            taskDao.delete(req.getParameter("task"));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/home");
    }
}