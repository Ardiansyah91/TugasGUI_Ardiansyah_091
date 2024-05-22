/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_ardiansyah;

/**
 *
 * @author LENOVO
 */
import javax.swing.*;
import java.awt.*;

public class TodoView extends JFrame {
    private JTextField todoInput;
    private JButton addButton;
    private JTextArea todoListArea;

    public TodoView() {
        todoInput = new JTextField(20);
        addButton = new JButton("Tambahkan");
        todoListArea = new JTextArea(10, 30);
        todoListArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("Tugas Baru:"));
        panel.add(todoInput);
        panel.add(addButton);
        
        this.setLayout(new BorderLayout());
        this.add(panel, BorderLayout.NORTH);
        this.add(new JScrollPane(todoListArea), BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    public String getTodoInput() {
        return todoInput.getText();
    }

    public void clearTodoInput() {
        todoInput.setText("");
    }

    public void setTodoList(String todoList) {
        todoListArea.setText(todoList);
    }

    public JButton getAddButton() {
        return addButton;
    }
}

