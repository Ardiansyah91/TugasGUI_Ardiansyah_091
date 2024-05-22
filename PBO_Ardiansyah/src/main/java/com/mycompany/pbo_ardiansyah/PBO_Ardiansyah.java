/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo_ardiansyah;

/**
 * Nama : Ardiansyah
 * Nim : 13020220091
 * Kelas : A3
 * @author LENOVO
 */
public class PBO_Ardiansyah {
    public static void main(String[] args) {
        TodoModel model = new TodoModel();
        TodoView view = new TodoView();
        TodoController controller = new TodoController(model, view);
    }
   
}
