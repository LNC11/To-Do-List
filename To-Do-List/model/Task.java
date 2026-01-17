package model;

public class Task extends AbstractTask {
    private String status;

    public Task(int id, String name, String desc, String status) {
        super(id, name, desc);
        setStatus(status);
    }

    @Override
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
