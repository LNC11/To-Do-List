package model;

public class TimedTask extends Task {
    int estimatedMinutes;

    public TimedTask(int id, String name, String desc, String status, int estimatedMinutes) {
        super(id, name, desc, status);
        this.estimatedMinutes = estimatedMinutes;
    }
}
