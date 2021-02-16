package com.kodilla.spring.portfolio;

import org.springframework.scheduling.config.Task;

public class Board {

    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }
    public void addToDoList(String text) {
        toDoList.addTask(text);
    }
    public void addinProgressList(String text) {
        inProgressList.addTask(text);
    }
    public void adddoneList(String text) {
        doneList.addTask(text);
    }
}
