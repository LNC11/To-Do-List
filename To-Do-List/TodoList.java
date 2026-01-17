
import controller.TaskManager;
import ui.Window;

public class TodoList {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        new Window(manager).setVisible(true);
    }
}
