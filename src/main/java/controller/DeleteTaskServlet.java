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

/**
 * Created by employee on 11/15/16.
 */
@WebServlet({"/delete"})
public class DeleteTaskServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession session = req.getSession(true);
//        req.getParameter("task");
//        session.removeAttribute(req.getParameter("task"));
//        resp.sendRedirect("/home");
        try {
            TaskDao taskDao =  new TaskDao();
            taskDao.delete(req.getParameter("task"));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/home");
    }
}