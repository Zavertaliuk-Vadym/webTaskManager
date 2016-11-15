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
    private List<Task> messages = new ArrayList<>();

    public Task(String taskId, String title) {
        this.taskId = taskId;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addMessage(Task task){
        messages.add(task);
    }

    public List<Task> getMessages(){
        return messages;
    }

    public Integer getMessagesValues(){
        return messages.size();
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
