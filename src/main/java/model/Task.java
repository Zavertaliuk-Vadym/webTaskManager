package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/15/16.
 */
public class Task {

    private String taskId;
    private String title;
    private String details;
    private  boolean view = false;


    public Task(String taskId, String title, String details) {
        this.taskId = taskId;
        this.title = title;
        this.details = details;
    }
    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
