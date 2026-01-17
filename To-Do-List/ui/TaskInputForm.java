package ui;

import controller.TaskManager;
import model.Task;

import javax.swing.*;
import java.awt.*;

public class TaskInputForm extends JFrame {

    public TaskInputForm(Window parent, TaskManager manager) {

        setTitle("Add Task");
        setSize(400, 200);
        setLayout(new GridLayout(5, 2));

        JTextField txtId = new JTextField(
                String.valueOf(manager.generateTaskId()));
        txtId.setEditable(false);

        JTextField txtName = new JTextField();
        JTextArea txtDesc = new JTextArea();

        JComboBox<String> statusBox = new JComboBox<>(
                new String[]{"NOT STARTED", "ONGOING", "DONE"});

        JButton saveBtn = new JButton("Save");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        add(new JLabel("Task ID:"));
        add(txtId);
        add(new JLabel("Task Name:"));
        add(txtName);
        add(new JLabel("Description:"));
        add(txtDesc);
        add(new JLabel("Status:"));
        add(statusBox);
        add(saveBtn);
        buttonPanel.add(saveBtn);

        add(new JLabel(""));
        add(buttonPanel);

        saveBtn.addActionListener(e -> {
            if (txtName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "You need to put task name!");
                return;
            }

            Task task = new Task(
                    Integer.parseInt(txtId.getText()),
                    txtName.getText(),
                    txtDesc.getText(),
                    statusBox.getSelectedItem().toString()
            );

            manager.addTask(task);
            parent.refreshTable();
            dispose();
        });
    }
}
