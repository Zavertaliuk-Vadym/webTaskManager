package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by employee on 11/15/16.
 */
public class Task {

    private String taskId;
    private String title;
    private String details;
    private boolean view = false;
    private String localTime ;


    public Task(String taskId, String title, String details,String localTime) {
        this.taskId = taskId;
        this.title = title;
        this.details = details;
        this.localTime=localTime;
    }
    public boolean getView() {
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

    public String getLocalTime() {
        return localTime;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }
}
