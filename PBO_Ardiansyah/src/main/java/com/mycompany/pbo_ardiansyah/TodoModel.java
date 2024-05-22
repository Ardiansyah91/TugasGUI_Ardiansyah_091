/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbo_ardiansyah;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public class TodoModel {
    private List<String> todoList;

    public TodoModel() {
        todoList = new ArrayList<>();
    }

    public void addTodoItem(String item) {
        todoList.add(item);
    }

    public List<String> getTodoList() {
        return todoList;
    }
}
