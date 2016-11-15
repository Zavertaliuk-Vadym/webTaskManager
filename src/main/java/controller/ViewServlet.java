package controller;

import model.Task;

import javax.servlet.RequestDispatcher;
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
        System.out.println("Пришло id="+req.getParameter("task"));
        Task task = (Task) session.getAttribute(req.getParameter("task") + "");
        System.out.println("ТАска="+task);
        System.out.println("такс ид"+task.getTaskId());
        System.out.println("task bool"+task.isView());
        task.setView(!task.isView());
        System.out.println("task bool"+task.isView());
        resp.sendRedirect("/home");
    }
}