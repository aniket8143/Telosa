package com.example.todo.model;

public class Todo {
    private String task;
    private boolean completed;

    public Todo() {}

    public Todo(String task) {
        this.task = task;
        this.completed = false;
    }

    // Getters and Setters
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
