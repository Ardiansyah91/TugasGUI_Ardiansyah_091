/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_ardiansyah;

/**
 *
 * @author LENOVO
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TodoController {
    private TodoModel model;
    private TodoView view;

    public TodoController(TodoModel model, TodoView view) {
        this.model = model;
        this.view = view;

        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newTodo = view.getTodoInput();
                if (!newTodo.isEmpty()) {
                    model.addTodoItem(newTodo);
                    view.clearTodoInput();
                    updateTodoList();
                }
            }
        });
    }

    private void updateTodoList() {
        StringBuilder todoListBuilder = new StringBuilder();
        for (String todo : model.getTodoList()) {
            todoListBuilder.append(todo).append("\n");
        }
        view.setTodoList(todoListBuilder.toString());
    }
}

