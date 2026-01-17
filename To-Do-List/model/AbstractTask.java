package model;
public class AbstractTask {
    private int taskID;
    private String taskName;
    private String taskDescription;

    public AbstractTask() {

    }
    public AbstractTask(int taskID, String taskName, String taskDescription) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public String getStatus() {
        return getStatus();
    }
    public void setStatus(String status) {
        
    }

    public void setTaskID(int id) {
        this.taskID = id;
    }
    public int getTaskID() {
        return taskID;
    }

    public void setTaskName(String name) {
        this.taskName = name;
    }
    public String getTaskName() {
        return taskName;
    }

    public void getTaskDescription(String desc) {
        this.taskDescription = desc;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    
}
