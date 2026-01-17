package ui;

import controller.TaskManager;
import model.Task;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Window extends JFrame {

    private TaskManager manager;
    private JTable table;
    private DefaultTableModel model;
    private TaskInputForm form;

    public Window(TaskManager manager) {
        this.manager = manager;

        setTitle("TO-DO-LIST");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton addBtn = new JButton("Add Task");
        add(addBtn, BorderLayout.NORTH);

        model = new DefaultTableModel(
                new String[]{"ID", "Name", "Description", "Status"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        addBtn.addActionListener(e -> {
            if (form == null || !form.isVisible()) {
                form = new TaskInputForm(this, manager);
                form.setVisible(true);
            }
        });
    }

    public void refreshTable() {
        model.setRowCount(0);
        for (Task t : manager.getTasks()) {
            model.addRow(new Object[]{
                    t.getTaskID(),
                    t.getTaskName(),
                    t.getTaskDescription(),
                    t.getStatus()
            });
        }
    }
}
