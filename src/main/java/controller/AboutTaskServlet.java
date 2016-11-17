package controller;

import dao.ListDao;
import dao.TaskDao;
import model.Task;
import model.ListName;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet({"/messages"})
public class AboutTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Task> taskList = new ArrayList<>();
        List<ListName> listLists = new ArrayList<>();
        try {
            TaskDao taskDao = new TaskDao();
            taskList.addAll(taskDao.viewDescription(req.getParameter("task")));
            ListDao listDao = new ListDao();
            listLists.addAll(listDao.getListTasksFromCurrentTask(req.getParameter("listId")));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/jsp/about.jsp");
        req.setAttribute("taskList", taskList);
        req.setAttribute("listLists", listLists);
        dispatcher.forward(req, resp);
    }
}
