package controller;

import java.util.ArrayList;
import model.Task;

public class TaskManager {
    
    private ArrayList<Task> taskList = new ArrayList<>();

    public void addTask(Task task) {
        taskList.add(task);
    }

    public ArrayList<Task> getTasks() {
        return taskList;
    }

    public int generateTaskId() {
        return taskList.size() + 1;
    }
}
