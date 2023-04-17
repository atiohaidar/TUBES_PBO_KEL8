package com.tugas.todolist.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{id_kategori}/")
public class TodoListController {
    @GetMapping
    public String lihatTodoList(){
        return "/Kategori/Todo/lihatTodo";
    }
    @GetMapping("/edit/{index}")
    public String editTodoList(){
        return "/Kategori/Todo/editTodo";
    }
    @GetMapping("/add")
    public String tambahTodoList(){
        return "/Kategori/Todo/tambahTodo";
    }

}
