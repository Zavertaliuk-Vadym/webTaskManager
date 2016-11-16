package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by employee on 11/15/16.
 */
public class Task {

    private int taskId;
    private String title;
    private String details;
    private boolean view = false;
    private String localTime;
    private String currentDay;


    public Task(int taskId, String title, String details, boolean view, String localTime,String currentDay) {
        this.taskId = taskId;
        this.title = title;
        this.details = details;
        this.view = view;
        this.localTime = localTime;
        this.currentDay = currentDay;
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLocalTime() {
        return localTime;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public String getCurrentDay() {
        return currentDay;
    }

    public void setCurrentDay(String currentDay) {
        this.currentDay = currentDay;
    }

}
