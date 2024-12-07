package com.example.todo.controller;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {

    private List<Todo> todos = new ArrayList<>();

    @GetMapping("/")
    public String showTodoList(Model model) {
        model.addAttribute("todos", todos);
        model.addAttribute("newTodo", new Todo(""));  // For form input
        return "index";
    }

    @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo todo) {
        todos.add(todo);
        return "redirect:/";
    }

    @PostMapping("/toggle")
    public String toggleCompletion(@RequestParam int index) {
        Todo todo = todos.get(index);
        todo.setCompleted(!todo.isCompleted());
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTodo(@RequestParam int index) {
        todos.remove(index);
        return "redirect:/";
    }
}
