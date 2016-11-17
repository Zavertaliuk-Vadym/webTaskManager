package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by employee on 11/15/16.
 */
@Entity
@Table(name = "table")
public class Task {
    @Id
    private int taskId;
    @Column(name = "title")
    private String title;
    @Column(name = "details")
    private String details;
    @Column(name = "view")
    private boolean view = false;
    @Column(name = "localTime")
    private String localTime;
    @Column(name = "currentDay")
    private String currentDay;
    @Column(name = "list_id")
    private int list_id ;


    public Task(int taskId, String title, String details, boolean view, String localTime,String currentDay,int list_id) {
        this.taskId = taskId;
        this.title = title;
        this.details = details;
        this.view = view;
        this.localTime = localTime;
        this.currentDay = currentDay;
        this.list_id=list_id;
    }

    public Task() {
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

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

}
