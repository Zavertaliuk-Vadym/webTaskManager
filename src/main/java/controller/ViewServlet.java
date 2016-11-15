package controller;

import model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet({"/view"})
public class ViewServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        String taskId = req.getParameter("task");
        Task task = (Task) session.getAttribute(taskId);
        task.setView(!task.getView());
        session.setAttribute(taskId, task);
        resp.sendRedirect("/home");
    }
}